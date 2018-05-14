package EKPL2.Lab.February23_Multithreading.Procedure1;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PrintNum {
  private int lastNum;

  PrintNum(int n) {
    lastNum = n;
  }

  public void print() {
    for (int i = 0; i < lastNum; i++) {
      System.out.print("" + i + " ");
    }
  }
}