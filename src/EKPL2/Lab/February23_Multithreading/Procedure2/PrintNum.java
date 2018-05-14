package EKPL2.Lab.February23_Multithreading.Procedure2;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintNum extends Thread {
  private int lastNum;
  private int DELAY = 250;

  PrintNum(int n) {
    lastNum = n;
  }

  @Override
  public void run() {
    for (int i = 0; i < lastNum; i++) {
      try {
        sleep(DELAY);
      } catch (InterruptedException ie) {
      }
      System.out.print("" + i + " ");
    }
  }
}

