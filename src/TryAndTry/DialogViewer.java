package TryAndTry;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Sheldon on 9/29/2016.
 */
public class DialogViewer {
  public static void main(String[] args) {
    //JOptionPane.showMessageDialog(null, "Hello, World!");
//        JOptionPane.showMessageDialog(null, "Dimas Sheldon Trying to Program Java");
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(name);
//        JOptionPane.showMessageDialog(null, "Hello, "+ name + "!");
//        String nie = JOptionPane.showInputDialog("My Name is Nie! How are you " + name + "?");
//        JOptionPane.showMessageDialog(null, "Good to know you're " + nie + ", " + name);

//        int click = JOptionPane.showConfirmDialog(null, "cLick", "Click", 2, 0);
//        System.out.println(click);
    ArrayList<Double> yPoints = new ArrayList<>();
    ArrayList<Double> xPoints = new ArrayList<>();

    for (double i = 0; i <= 360; i += 90) {
      xPoints.add(i);
      yPoints.add(Math.sin(Math.toRadians(i)));
      }

    System.out.println(xPoints);
//    System.out.println(yPoints);

    for (int i = 0; i <= xPoints.indexOf(180.0); i++) {

    }

//    double angle = 90;
//    double result  = Math.sin( Math.toRadians( angle ) ) ;
//    System.out.println( result ) ;
  }
}
