import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					System.out.println("hi");
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					System.out.println("hello");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
