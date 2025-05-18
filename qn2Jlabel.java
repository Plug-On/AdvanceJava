//2. WAP to Create a Swing application that displays "Hello, Swing!" in a JLabel inside a JFrame.

import javax.swing.JFrame;
import javax.swing.JLabel;

public class qn2Jlabel {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Hello Swing Example");
        JLabel label = new JLabel("Hello, Swing!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
