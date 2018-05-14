package TryAndTry;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/25/2016.
 */

public class EllipseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
//        Rectangle trafficLightBox = new Rectangle(95, 10, 175, 575);
//        g2.setColor(Color.BLACK);
//        g2.fill(trafficLightBox);

//        Ellipse2D.Double redCircle = new Ellipse2D.Double(125, 25, 150, 150);
//        g2.setColor(Color.RED);
//        g2.fill(redCircle);
//
//        Ellipse2D.Double yellowCircle = new Ellipse2D.Double(125, 225, 150, 150);
//        g2.setColor(Color.YELLOW);
//        g2.fill(yellowCircle);
//
//        Ellipse2D.Double greenCircle = new Ellipse2D.Double(125, 425, 150, 150);
//        g2.setColor(Color.GREEN);
//        g2.fill(greenCircle);

        g2.setColor(Color.BLACK);
        for (int i = 1; i < 65; i++) {
            g2.drawArc(i + 100, 80-i, 150, 100, 0, 180);
            g2.drawArc(i + 100, 280-i, 150, 100, 0, 180);
            g2.drawArc(i + 100, 480-i, 150, 100, 0, 180);
        }
//        g2.draw3DRect(100, 80, 200, 450, true);
//        g2.setColor(Color.BLACK);
//        for (int i = 1; i < 65; i++) {
//            g2.drawArc(100, i + 10, 150, 100, 0, 180);
//        }
//        for (int i = 1; i < 65; i++) {
//            g2.drawArc(100, i + 210, 150, 100, 0, 180);
//        }
//        for (int i = 1; i < 65; i++) {
//            g2.drawArc(100, i + 410, 150, 100, 0, 180);
//        }
    }
}