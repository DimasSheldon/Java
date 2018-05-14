package TryAndTry;

import javax.swing.*;

/**
 * Created by Sheldon on 10/26/2016.
 */
public class LineDistanceTester2 {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        LineDistCmp comp = new LineDistCmp();
        window.add(comp);
    }
}
