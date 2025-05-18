//1. WAP to create a basic Swing application that opens a window (JFrame) with a title "My First Swing Application".

import javax.swing.JFrame;

public class qn1Jframe {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My First Swing Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
