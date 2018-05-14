package EKPL2.Lab.February23_Multithreading.Procedure4;

/**
 * Created by Sheldon on 2/23/2017.
 */
public class PiggyBankAppSync {
  private PiggyBank syncBank = new PiggyBank();
  private Thread[] threads = new Thread[100];

  public PiggyBankAppSync() {
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

  private static synchronized void addPenny(PiggyBank bank) {
    int newBalance = bank.getBalance() + 1000;
    try {
      Thread.sleep(5);
    } catch (InterruptedException ie) {
    }
    bank.setBalance(newBalance);
  }

  class AddPennyThread extends Thread {
    public void run() {
      int newBalance = syncBank.getBalance() + 1000;
      System.out.println("Tabung 1000 => Balance = " + newBalance);
      addPenny(syncBank);

    }
  }

  public static void main(String[] args) {
    PiggyBankAppSync test = new PiggyBankAppSync();
    System.out.println("What is balance? " + test.syncBank.getBalance());
  }
}