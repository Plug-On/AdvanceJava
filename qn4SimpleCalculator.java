// 4. Write a java program with three text boxes First Number, Second Number and Result and
// four buttons add, subtract, multiply and divide. Handle the events to perform the required
// operations and display result.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class qn4SimpleCalculator {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel label1 = new JLabel("First Number:");
        JTextField text1 = new JTextField();

        JLabel label2 = new JLabel("Second Number:");
        JTextField text2 = new JTextField();

        JLabel label3 = new JLabel("Result:");
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton mulBtn = new JButton("Multiply");
        JButton divBtn = new JButton("Divide");

        // Add components to frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(label3);
        frame.add(result);

        // Add buttons in a grid layout (2 rows, 2 columns)
        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        // Action listeners
        ActionListener action = e -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double res = 0;

                if (e.getSource() == addBtn) {
                    res = num1 + num2;
                } else if (e.getSource() == subBtn) {
                    res = num1 - num2;
                } else if (e.getSource() == mulBtn) {
                    res = num1 * num2;
                } else if (e.getSource() == divBtn) {
                    if (num2 != 0)
                        res = num1 / num2;
                    else {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                }

                result.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                result.setText("Invalid input");
            }
        };

        addBtn.addActionListener(action);
        subBtn.addActionListener(action);
        mulBtn.addActionListener(action);
        divBtn.addActionListener(action);

        // Show frame
        frame.setVisible(true);
    }
}
