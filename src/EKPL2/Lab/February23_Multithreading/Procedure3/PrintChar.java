package EKPL2.Lab.February23_Multithreading.Procedure3;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintChar implements Runnable {
  private char charToPrint;
  private int times;
  private int DELAY = 500;

  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  @Override
  public void run() {
    for (int i = 0; i < times; i++) {
      try {
        Thread.currentThread().sleep(DELAY);
      } catch (InterruptedException ie) {
      }
      System.out.print(charToPrint + " ");
    }
  }
}