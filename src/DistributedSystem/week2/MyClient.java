package DistributedSystem.week2;

import java.net.*;
import java.io.*;

class MyClient {
  public static void main(String args[]) throws Exception {
    InetAddress ip;
    String hostname;

//    Socket s = new Socket("192.168.43.74", 3333);
    Socket s = new Socket("localhost", 3333);
    DataInputStream din = new DataInputStream(s.getInputStream());
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = "", str2 = "";
    while (!str.equals("stop")) {
      ip = InetAddress.getLocalHost();
      hostname = ip.getHostName();

      str = br.readLine();
      dout.writeUTF(str);
      dout.flush();
      str2 = din.readUTF();
      System.out.println("Server says: " + ip);
    }

    dout.close();
    s.close();
  }
}