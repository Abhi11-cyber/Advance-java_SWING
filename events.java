import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class events extends JFrame implements ActionListener{

    TextField tf;
    events() 
    {
        JButton Bt =new JButton("Action-event");
        tf = new TextField();
        tf.setBounds(100, 150, 250, 30);
        Bt.addActionListener(this);
        Bt.setBounds(100, 100, 250, 30);
        add(Bt);
        add(tf);
        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent a)
    {
        System.out.println("command:"+a.getActionCommand());
        tf.setText("actionevent successfully performed");
    }
    public static void main(String[] args) {
        events frame =new events();
    }
}