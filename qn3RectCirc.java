//3. WAP to Create a Swing application that draws a rectangle and a circle in a JPanel.

import javax.swing.*;
import java.awt.*;

public class qn3RectCirc {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Draw Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        
        frame.add(new MyPanel());

        
        frame.setVisible(true);
    }
}


class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 60);

        
        g.setColor(Color.RED);
        g.drawOval(200, 50, 60, 60);  
    }
}
