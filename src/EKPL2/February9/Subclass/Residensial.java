package EKPL2.February9.Subclass;

import EKPL2.February9.AbstractClass.Invoice;

/**
 * Created by Sheldon on 2/9/2017.
 * Yovan Christ 1314009
 * Dimas Sheldon 1415002
 * Triandi Shafa 1415009
 * Joshua Sumardi 1315010
 */
public class Residensial extends Invoice {
  private String name;
  private int ID;

  public Residensial(String name, int ID) {
    this.name = name;
    this.ID = ID;
  }

  public double calculatePayment(int kwhRate, int days) {
    final double RESIDENSIAL_PRICE = 50;
    return totalPayment = kwhRate * RESIDENSIAL_PRICE * days;
  }

  public String toString() {
    return "Category\t: " + getClass().getSimpleName()
            + "\nUsername\t: " + name
            + "\nUser ID\t\t: " + ID;
  }
}
