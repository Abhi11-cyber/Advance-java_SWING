import java.awt.FlowLayout;
import javax.swing.*;

public class jbutton {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Jbutton");
        JButton b = new JButton("Register");
        b.setBounds(100, 200, 400, 100);
        fr.add(b);
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setLayout(new FlowLayout());
    }
}
