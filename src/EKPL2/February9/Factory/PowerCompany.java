package EKPL2.February9.Factory;


import EKPL2.February9.AbstractClass.Invoice;
import EKPL2.February9.Subclass.Comersial;
import EKPL2.February9.Subclass.Industrial;
import EKPL2.February9.Subclass.Residensial;

/**
 * Created by Sheldon on 2/9/2017.
 * Yovan Christ 1314009
 * Dimas Sheldon 1415002
 * Triandi Shafa 1415009
 * Joshua Sumardi 1315010
 */
public class PowerCompany {
  public Invoice getInvoice(char category, String name, int ID) {
    Invoice inv = null;

    switch (category) {
      case ('R'):
      case ('r'):
        inv = new Residensial(name, ID);
        break;
      case ('I'):
      case ('i'):
        inv = new Industrial(name, ID);
        break;
      case ('C'):
      case ('c'):
        inv = new Comersial(name, ID);
        break;
    }

    return inv;
  }
}
