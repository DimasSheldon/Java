package TryAndTry;

import javax.swing.*;

/**
 * Created by Sheldon on 10/24/2016.
 */
public class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
