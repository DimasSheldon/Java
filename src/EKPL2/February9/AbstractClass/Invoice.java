package EKPL2.February9.AbstractClass;

/**
 * Created by Sheldon on 2/9/2017.
 * Yovan Christ 1314009
 * Dimas Sheldon 1415002
 * Triandi Shafa 1415009
 * Joshua Sumardi 1315010
 */
public abstract class Invoice {
  protected double totalPayment;
  public abstract double calculatePayment(int kwhRate, int days);
}
