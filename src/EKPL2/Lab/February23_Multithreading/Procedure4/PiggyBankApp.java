package EKPL2.Lab.February23_Multithreading.Procedure4;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PiggyBankApp {
  private PiggyBank bank = new PiggyBank();
  private Thread[] threads = new Thread[100];

  public PiggyBankApp() {
    ThreadGroup g = new ThreadGroup("group");
    boolean done = false;

    for (int i = 0; i < 100; i++) {
      threads[i] = new Thread(g, new AddPennyThread(), "t");
      threads[i].start();
    }


    while (!done) {
      if (g.activeCount() == 0) {
        done = true;
      }
    }
  }

  class AddPennyThread extends Thread {
    public void run() {
      int newBalance = bank.getBalance() + 1000;
      System.out.println("Tabung 1000 => Balance = " + newBalance);

      try {
        Thread.sleep(5);
      } catch (InterruptedException ie) {
        System.out.println(ie);
      }

      bank.setBalance(newBalance);
    }
  }

  public static void main(String[] args) {
    PiggyBankApp test = new PiggyBankApp();
    System.out.println("What is balance? " + test.bank.getBalance());
  }
}