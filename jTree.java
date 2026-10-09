import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.tree.*;

public class jTree {

    public static void main(String[] args) {

        JFrame fr = new JFrame("JTree");
        DefaultMutableTreeNode Root = new DefaultMutableTreeNode("Nutritious Food");

        DefaultMutableTreeNode Fruits = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode Vegetables = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode Dryfruits = new DefaultMutableTreeNode("Dryfruits");

        Root.add(Fruits);
        Root.add(Vegetables);
        Root.add(Dryfruits);

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("Banana");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Orange");
        DefaultMutableTreeNode d = new DefaultMutableTreeNode("Avocado");

        Fruits.add(a);
        Fruits.add(b);
        Fruits.add(c);
        Fruits.add(d);

        DefaultMutableTreeNode e = new DefaultMutableTreeNode("Tomato");
        DefaultMutableTreeNode f = new DefaultMutableTreeNode("Potato");
        DefaultMutableTreeNode g = new DefaultMutableTreeNode("Brinjal");
        DefaultMutableTreeNode H = new DefaultMutableTreeNode("Onion");

        Vegetables.add(e);
        Vegetables.add(f);
        Vegetables.add(g);
        Vegetables.add(H);

        DefaultMutableTreeNode i = new DefaultMutableTreeNode("Almond");
        DefaultMutableTreeNode j = new DefaultMutableTreeNode("Cashew");
        DefaultMutableTreeNode k = new DefaultMutableTreeNode("Pista");
        DefaultMutableTreeNode l = new DefaultMutableTreeNode("Kesar");

        Dryfruits.add(i);
        Dryfruits.add(l);
        Dryfruits.add(k);
        Dryfruits.add(j);

        JTree tree = new JTree(Root);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

        JScrollPane jsp = new JScrollPane(tree, v, h);
        fr.add(jsp, BorderLayout.CENTER);
        fr.setSize(500, 500);
        fr.setVisible(true);

    }

}
