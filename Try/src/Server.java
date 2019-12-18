import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

//import newClient.Server;

import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Server
{
	static Vector<Socket> ClientSockets;
	int data = 0;
	int fps = 10;

	Server() throws IOException
	{
		System.out.println("Server started");

		ServerSocket server = new ServerSocket(8000);
		ClientSockets = new Vector<Socket>();

		while (true)
		{
			Socket client = server.accept();
			AcceptClient acceptClient = new AcceptClient(client);
			System.out.println("Client connected");
		}
	}

	class AcceptClient extends Thread {
		Socket ClientSocket;
		ObjectInputStream in;
		ObjectOutputStream out;

		AcceptClient(Socket client) throws IOException {
			ClientSocket = client;
			in = new ObjectInputStream(ClientSocket.getInputStream());
			out = new ObjectOutputStream(ClientSocket.getOutputStream());

			ClientSockets.add(ClientSocket);
			//out.reset();
			start();

		}

		public void run() {
			try {
				while (true) {

					String msgFromClient = in.readUTF();
					System.out.println(msgFromClient);
					for (int i = 0; i < ClientSockets.size(); i++) {
						Socket pSocket = (Socket) ClientSockets.elementAt(i);
						if (ClientSocket.equals(pSocket))
							continue;
						ObjectOutputStream pOut = new ObjectOutputStream(pSocket.getOutputStream());
						pOut.writeObject(new Object());
						pOut.flush();
					}
				}
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Server server = new Server();
	}
}