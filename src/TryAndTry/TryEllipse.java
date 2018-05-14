package TryAndTry;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/25/2016.
 */
public class TryEllipse {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(700, 725);
        myFrame.getContentPane().setBackground(Color.WHITE);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EllipseComponent ellComponent = new EllipseComponent();
        myFrame.add(ellComponent);
        myFrame.setVisible(true);


    }
}