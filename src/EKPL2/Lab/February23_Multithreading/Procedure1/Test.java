package EKPL2.Lab.February23_Multithreading.Procedure1;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class Test {
  public static void main(String[] args) {
    PrintChar printA = new PrintChar('a', 5);
    PrintChar printB = new PrintChar('b', 5);
    PrintNum printN = new PrintNum(5);
    printA.print();
    printB.print();
    printN.print();
  }
}