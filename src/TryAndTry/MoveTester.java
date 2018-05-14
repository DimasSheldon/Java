package TryAndTry;

import java.awt.*;

/**
 * Created by Sheldon on 9/29/2016.
 */
public class MoveTester {
    public static void main(String[] args) {
        Rectangle box  = new Rectangle(5, 10, 20, 30);

        //Move the Rectangle
        box.translate(15, 25);

        //print information about the moved rectangle
        System.out.print("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 20");

        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");
    }
}
