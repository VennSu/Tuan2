package btTuan2;

import javax.swing.*;

public class b1 extends JFrame {
    public b1( String title){

        super(title);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        b1 b1 = new b1("Demo Windows");
    }
}
