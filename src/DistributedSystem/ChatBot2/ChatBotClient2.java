package DistributedSystem.ChatBot2;

import java.io.*;
import java.net.Socket;

public class ChatBotClient2 {
  public static void main(String args[]) throws IOException {
//    InetAddress address = InetAddress.getLocalHost();
//    String address = "192.168.8.103";
    String address = "localhost";
    Socket s1 = null;
    String line = null;
    BufferedReader br = null;
    BufferedReader is = null;
    PrintWriter os = null;

    try {
      s1 = new Socket(address, 4445); // You can use static final constant PORT_NUM
      br = new BufferedReader(new InputStreamReader(System.in));
      is = new BufferedReader(new InputStreamReader(s1.getInputStream()));
      os = new PrintWriter(s1.getOutputStream());
    } catch (IOException e) {
      e.printStackTrace();
      System.err.print("IO Exception");
    }

    System.out.println("Server Address : " + address);
    System.out.println("Enter Data to echo Server ( Enter EXIT to end):");

    String response = null;
    try {
      line = br.readLine();
      while (line.compareTo("EXIT") != 0) {
        os.println(line);
        os.flush();
        response = is.readLine();
        System.out.println("Server Response : " + response);
        line = br.readLine();

      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Socket read Error");
    } finally {
      is.close();
      os.close();
      br.close();
      s1.close();

      System.out.println("Connection Closed");
    }
  }
}
