package TryAndTry;

import java.util.Random;

/**
 * Created by Sheldon on 10/26/2016.
 */
public class Lottery {
    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int range = max - min;

        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        Random r4 = new Random();
        Random r5 = new Random();
        Random r6 = new Random();

        int number1 = r1.nextInt(6) + 1;
        int number2 = r2.nextInt(range) + 1;
        int number3 = r3.nextInt(range) + 1;
        int number4 = r4.nextInt(range) + 1;
        int number5 = r5.nextInt(range) + 1;
        int number6 = r6.nextInt(range) + 1;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
    }
}
