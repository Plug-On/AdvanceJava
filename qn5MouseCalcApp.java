// 5. Write a GUI application to find sum and difference of two integer numbers.Use two text
// fields for input and third text field for output. Your program should display sum if user
// presses the mouse and difference if the user releases the mouse.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class qn5MouseCalcApp {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Mouse-Based Calculator");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel label1 = new JLabel("First Number:");
        JTextField text1 = new JTextField();

        JLabel label2 = new JLabel("Second Number:");
        JTextField text2 = new JTextField();

        JLabel label3 = new JLabel("Result:");
        JTextField result = new JTextField();
        result.setEditable(false);

        // Add components
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(label3);
        frame.add(result);
        frame.add(new JLabel()); // filler
        frame.add(new JLabel()); // filler

        // Add mouse listener to the frame's content pane
        frame.getContentPane().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());
                    int b = Integer.parseInt(text2.getText());
                    result.setText("Sum: " + (a + b));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }

            public void mouseReleased(MouseEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());
                    int b = Integer.parseInt(text2.getText());
                    result.setText("Difference: " + (a - b));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
