package EKPL2.ReUTSTobias;

import java.util.Scanner;

/**
 * Created by Tobias on 27/03/2017.
 */
public class Client {
    public static void main(String[] args) {
        Thermometer term = new ThermometerAdapter();
        Scanner input = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Welcome to the Termometer Program");
        System.out.println("=================================");
        System.out.print("Please insert your desired temperature (in Celcius): ");
        double tempInC = input.nextDouble();
        char option;
        boolean loop;
        do {
            System.out.print("Convert to Reamur or Kelvin: ");
            option = input.next().charAt(0);
            if ((option == 'r' || option == 'R' || option == 'K' || option == 'k')){
                 loop = false;
            }
            else {
                System.out.println("Invalid input");
                loop = true;
            }
        }
        while (loop);

        System.out.println();
        System.out.println("Your input = " + tempInC + "\u00B0C");
        term.setTemp(tempInC);
        term.getTemp(option);
    }
}
