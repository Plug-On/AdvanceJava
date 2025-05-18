import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class qn6OddEvenChecker {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Odd or Even Checker");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Components
        JLabel label = new JLabel("Enter a number:");
        JTextField numberField = new JTextField();
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Add components to frame
        frame.add(label);
        frame.add(numberField);
        frame.add(checkButton);
        frame.add(new JLabel()); // filler
        frame.add(resultLabel);
        frame.add(resultField);

        // Event handler
        checkButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numberField.getText());
                if (num % 2 == 0) {
                    resultField.setText("Even");
                } else {
                    resultField.setText("Odd");
                }
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
