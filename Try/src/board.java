import javax.swing.JFrame;
import javax.swing.JLabel;

public class board extends JFrame{
    JLabel text;
    public board() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mashu tipshi
        text= new JLabel();
        text.setText("shit");
        this.add(text);
        //od mashu
        this.setVisible(true);

    }

}
