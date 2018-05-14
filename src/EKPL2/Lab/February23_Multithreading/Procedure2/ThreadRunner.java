package EKPL2.Lab.February23_Multithreading.Procedure2;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class ThreadRunner {
  public static void main(String[] args) {
    PrintChar printA = new PrintChar('A', 15);
    PrintChar printB = new PrintChar('B', 15);
    PrintNum printN = new PrintNum(15);

    printA.start();
    printB.start();
    printN.start();


  }
}