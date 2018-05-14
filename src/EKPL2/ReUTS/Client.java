package EKPL2.ReUTS;

import java.util.Scanner;

/**
 * Created by Sheldon on 3/29/2017.
 */
public class Client {
  public static void main(String[] args) {
    Termometer theConverter = new TermometerAdapter();
    Scanner input = new Scanner(System.in);

    System.out.print("Temperature in celcius: ");
    double tempInC = input.nextDouble();
    System.out.println("Temperature to convert: " + tempInC + " C");
    theConverter.setTemp(tempInC);

    System.out.println("Convert to: (K)elvin; (R)eamur");
    char option = input.next().charAt(0);
    double result = theConverter.getTemp(option);
    System.out.println("Converted temperature: " + result);
  }
}