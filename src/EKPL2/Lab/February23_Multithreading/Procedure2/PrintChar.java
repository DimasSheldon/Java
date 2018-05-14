package EKPL2.Lab.February23_Multithreading.Procedure2;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintChar extends Thread {
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
        sleep(DELAY);
      } catch (InterruptedException ie){
      }
      System.out.print(charToPrint + " ");
    }
  }
}
