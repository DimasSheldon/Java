package EKPL2.Lab.February23_Multithreading.Procedure3;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class ThreadRunnerRunnable {
  public static void main(String[] args) {
    Thread printA = new Thread(new PrintChar('A', 15));
    Thread printB = new Thread(new PrintChar('B', 15));
    Thread printN = new Thread(new PrintNum(15));

    printA.start();
    printB.start();
    printN.start();
  }
}