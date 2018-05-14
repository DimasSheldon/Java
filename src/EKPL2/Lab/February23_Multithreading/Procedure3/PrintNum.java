package EKPL2.Lab.February23_Multithreading.Procedure3;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintNum implements Runnable {
  private int lastNum;
  private int DELAY = 250;

  PrintNum(int n) {
    lastNum = n;
  }

  @Override
  public void run() {
    for (int i = 0; i < lastNum; i++) {
      try {
        Thread.currentThread().sleep(DELAY);
      } catch (InterruptedException ie) {
      }
      System.out.print("" + i + " ");
    }
  }
}
