import javax.swing.*;

public class board extends JFrame{
    JLabel text;
    JLabel txt2;
    public JLabel getText() {
        return text;
    }

    public board() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        text= new JLabel();
        text.setText("shit");
        this.add(text);

        //JButton addSoldier = new JButton("Add");
        //addSoldier.setBounds(100,100,100,100);
        //this.add(addSoldier);

        this.setVisible(true);

    }

}
