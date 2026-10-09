import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class AdvancedSwingDemo extends JFrame {
    public AdvancedSwingDemo() {
        setTitle("Advanced Swing Components Demo");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Table Tab
        String[] columns = {"ID", "Name", "Score"};
        Object[][] data = {
            {1, "Alice", 85},
            {2, "Bob", 92},
            {3, "Charlie", 78}
        };
        JTable table = new JTable(new DefaultTableModel(data, columns));
        tabbedPane.addTab("Table", new JScrollPane(table));

        // Tree Tab
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        child1.add(new DefaultMutableTreeNode("Leaf 1"));
        child2.add(new DefaultMutableTreeNode("Leaf 2"));
        JTree tree = new JTree(root);
        tabbedPane.addTab("Tree", new JScrollPane(tree));

        // Progress Bar Tab
        JPanel progressPanel = new JPanel(new BorderLayout());
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        JButton startBtn = new JButton("Start Progress");
        startBtn.addActionListener((ActionEvent e) -> {
            new Thread(() -> {
                for (int i = 0; i <= 100; i += 5) {
                    try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                    progressBar.setValue(i);
                }
            }).start();
        });
        progressPanel.add(progressBar, BorderLayout.CENTER);
        progressPanel.add(startBtn, BorderLayout.SOUTH);
        tabbedPane.addTab("Progress", progressPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdvancedSwingDemo().setVisible(true));
    }
}