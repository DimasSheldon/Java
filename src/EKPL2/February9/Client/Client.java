package EKPL2.February9.Client;


import EKPL2.February9.AbstractClass.Invoice;
import EKPL2.February9.Factory.PowerCompany;

import java.util.Calendar;
import java.util.Scanner;


/**
 * Created by Sheldon on 2/9/2017.
 * Yovan Christ 1314009
 * Dimas Sheldon 1415002
 * Triandi Shafa 1415009
 * Joshua Sumardi 1315010
 */
public class Client {
  public static void main(String[] args) {
    int date = 1;
    int year = 2017;
    Calendar calendar = Calendar.getInstance();

    //CALCULATING DAYS IN MONTH FUNCTION
    Scanner input = new Scanner(System.in);

    System.out.print("User name: ");
    String name = input.next();

    System.out.print("User ID: ");
    int ID = input.nextInt();

    System.out.print("Enter Category (R/C/I): ");
    String category = input.next();

    System.out.print("Enter month: ");
    int month = input.nextInt();

    System.out.print("Enter kWh rate: ");
    int kwh = input.nextInt();

    calendar.set(year, (month - 1), date);
    int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

    PowerCompany PLN = new PowerCompany();
    Invoice invoice = PLN.getInvoice(category.charAt(0), name, ID);

    System.out.println();
    System.out.println(PLN.getInvoice(category.charAt(0), name, ID).toString());
    System.out.println("Total invoice\t: IDR " + invoice.calculatePayment(kwh, days));
  }
}