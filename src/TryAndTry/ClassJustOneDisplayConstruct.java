package TryAndTry;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/27/2016.
 */
public class ClassJustOneDisplayConstruct extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Line2D.Double line = new Line2D.Double(100, 100, 200, 200);
        g2.draw(line);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ClassJustOneDisplayConstruct component = new ClassJustOneDisplayConstruct();
        frame.add(component);
    }
}
