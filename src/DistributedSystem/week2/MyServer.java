package DistributedSystem.week2;

import java.net.*;
import java.io.*;

class MyServer {
  public static void main(String args[]) throws Exception {
    InetAddress ip;
    String hostname;

    ServerSocket ss = new ServerSocket(3333);

    Socket s1 = ss.accept();

    DataInputStream din1 = new DataInputStream(s1.getInputStream());
    DataOutputStream dout1 = new DataOutputStream(s1.getOutputStream());

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    String str = "", str2 = "";
    while (!str.equals("stop")) {
      ip = InetAddress.getLocalHost();
      hostname = ip.getHostName();

      str = din1.readUTF();
      System.out.println("client 1 says: " + str);
      str2 = br1.readLine();
      dout1.writeUTF(str2);
//      dout1.writeUTF(ip);
      dout1.flush();
    }
    din1.close();
    s1.close();
    ss.close();
  }
}