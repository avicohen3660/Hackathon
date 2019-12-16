import javax.swing.JFrame;
import javax.swing.JLabel;

public class board extends JFrame{
    JLabel text;
    JLabel txt2;
    public JLabel getText() {
        return text;
    }

    public board() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text= new JLabel();
        text.setText("shit");
        this.add(text);

        this.setVisible(true);

    }

}
