package TryAndTry;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/26/2016.
 */
public class LineDistCmp extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D graph2 = (Graphics2D) g;

        Line2D.Double lineGua = new Line2D.Double(100, 100, 200, 200);
        graph2.draw(lineGua);

        double jarak1 = lineGua.ptSegDist(100, 100, 200, 200, 100, 200);
        System.out.println(jarak1);
        double jarak2 = lineGua.ptSegDist(100, 100, 200, 200, 150, 150);
        System.out.println(jarak2);
        double jarak3 = lineGua.ptSegDist(100, 100, 200, 200, 200, 50);
        System.out.println(jarak3);

        Ellipse2D.Double circle1 = new Ellipse2D.Double(100, 200, 5, 5);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(150, 150, 10, 10);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(200, 50, 10, 10);

        graph2.draw(circle1);
        graph2.draw(circle2);
        graph2.draw(circle3);
    }
}
