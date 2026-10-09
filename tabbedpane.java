import javax.swing.*;
public class tabbedpane {
    public static void main(String[] args) {
    JFrame fr = new JFrame("Tabbed Pane");
    JTabbedPane tp=new JTabbedPane(JTabbedPane.LEFT);
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JPanel fruit,vegetable;

    fruit = new JPanel();
    l1=new JLabel("Orange");
    l2=new JLabel("Apple");
    l3=new JLabel("Papaya");
    l4=new JLabel("PineApple");

    fruit.add(l1);
    fruit.add(l2);
    fruit.add(l3);
    fruit.add(l4);

    vegetable =new JPanel();
    l5=new JLabel("Coriender");
    l6=new JLabel("Brinjal");
    l7=new JLabel("Potato");
    l8=new JLabel("Carrot");
    vegetable.add(l5);
    vegetable.add(l6);
    vegetable.add(l7);
    vegetable.add(l8);

    tp.addTab("Fruit", fruit);
    tp.addTab("vegetable", vegetable);
    tp.setBounds(50, 50, 600, 600);

    fr.add(tp);
    fr.setSize(1000,1000);
    fr.setLayout(null);
    fr.setVisible(true);

}
}