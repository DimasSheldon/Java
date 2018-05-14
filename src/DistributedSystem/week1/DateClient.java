package DistributedSystem.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * Trivial client for the date server.
 */
public class DateClient {

  public static void main(String[] args) throws IOException {
    String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
                    "running the date service on port 9090:");
    Socket s = new Socket(serverAddress, 9099);
//    Socket s = new Socket(serverAddress, 8888);
    BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedReader input_scnd = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedReader input_thrd = new BufferedReader(new InputStreamReader(s.getInputStream()));

    String answer = input.readLine();
    String answer_scnd = input_scnd.readLine();
    String answer_thrd = input_thrd.readLine();

    JOptionPane.showMessageDialog(null, answer);
    JOptionPane.showMessageDialog(null, answer_scnd);
    JOptionPane.showMessageDialog(null, answer_thrd);
    System.exit(0);
  }
}