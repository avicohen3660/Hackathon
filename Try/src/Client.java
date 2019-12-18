import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client implements Runnable {

	Socket socketConnection;
	DataOutputStream outToServer;
	ObjectInputStream oIn;
	board b;
	
	Client() throws UnknownHostException, IOException {

		b=new board();
		socketConnection = new Socket("192.168.1.29", 8000);
		outToServer = new DataOutputStream(socketConnection.getOutputStream());
		oIn = new ObjectInputStream(socketConnection.getInputStream());

		Thread tr=new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						System.out.flush();
						//b.getText().setText(din.readUTF());
						System.out.println(((Data)oIn.readObject()).getNum());
					} catch (IOException | ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		});
		tr.start();
		Thread thread;
		thread = new Thread(this);
		//thread.start();

		BufferedReader br = null;
		String ClientName = null;
		Scanner input = new Scanner(System.in);
		String SQL = "";
		try {
			//System.out.print("Enter you name: ");
			//ClientName = input.next();
			// ClientName += ": ";
			// QUERY PASSING

			br = new BufferedReader(new InputStreamReader(System.in));
			while (!SQL.equalsIgnoreCase("exit")) {
				// System.out.println();
				// System.out.print(ClientName);

				SQL = br.readLine();
				// SQL = input.next();
				outToServer.writeUTF("ClientName" + ": " + SQL);
				outToServer.flush();
				// System.out.println(din.readUTF());

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] arg) throws UnknownHostException, IOException {
		Client client = new Client();
	}

	public void run() {
		while (true) {
			try {
				/*
				 * String text = din.readUTF().split(": ")[1]; for (int i = 0; i <
				 * 20-text.length(); i++) { text="  "+text; } System.out.println(text);
				 */
				System.out.flush();
				System.out.println(oIn.readUTF());
				System.out.println("If we are here we are fucked!");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
