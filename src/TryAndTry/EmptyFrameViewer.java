package TryAndTry;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 9/29/2016.
 */
public class EmptyFrameViewer extends JComponent{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
