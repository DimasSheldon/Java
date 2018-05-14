package DistributedSystem.Quiz;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class MyServer {
  public static void main(String args[]) throws Exception {
    ServerSocket ss = new ServerSocket(3333);

    Socket s1 = ss.accept();

    DataInputStream din1 = new DataInputStream(s1.getInputStream());
    DataOutputStream dout1 = new DataOutputStream(s1.getOutputStream());

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    String str = "", str2 = "";
    while (!str.equals("stop")) {
      str = din1.readUTF();
      System.out.println("client says: " + str);
      if (str.equals("ITHB")) {
        System.out.println("Ya, ini kampus saya");
      } else if (str.equals("ITB") || str.equals("UNIKOM")) {
        System.out.println("Itu tetangga saya");
      } else {
        System.out.println("Saya tidak kenal");
      }
      str2 = br1.readLine();
      dout1.writeUTF(str2);
      dout1.flush();
    }
    din1.close();
    s1.close();
    ss.close();
  }
}