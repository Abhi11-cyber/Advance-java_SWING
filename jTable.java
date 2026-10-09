import java.awt.*;
import javax.swing.*;
public class jTable {
    public static void main(String[] args) {
        JFrame fr = new JFrame("JTable");

        String data[][]= {{"1","Abhishek","78000"},
                          {"2","Ankush","45000"},
                          {"3","Aditya","60000"}
                        };
        String Col[] = {"ID","NAME","SALARY"};
        JTable tb = new JTable(data,Col);
        tb.setBounds(30,40,400,500);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane sp = new JScrollPane(tb,v,h);
        fr.add(sp,BorderLayout.CENTER);
        fr.setSize(500,500);
        fr.setVisible(true);                
    }
}
