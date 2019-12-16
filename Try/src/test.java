import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Title");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		ImageIcon im = new ImageIcon(test.class.getResource("/giphy.gif"));
		//Image img = im.getImage();  
	    //im = new ImageIcon(img.getScaledInstance(-150, 50,  java.awt.Image.SCALE_SMOOTH)); 
	    
		JSprite j = new JSprite(im);
		JLabel label = new JLabel("HEY");
		label.setText("HEY");
		frame.add(label);
		frame.add(j);
		frame.setVisible(true);
	}
}
