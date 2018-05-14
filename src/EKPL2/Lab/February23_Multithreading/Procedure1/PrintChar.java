package EKPL2.Lab.February23_Multithreading.Procedure1;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintChar {
  private char charToPrint;
  private int times;

  PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  public void print() {
    for (int i = 0; i < times; i++) {
      System.out.print(charToPrint + " ");
    }
  }
}
