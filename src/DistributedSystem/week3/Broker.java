package DistributedSystem.week3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Broker {
  public static void main(String args[]) throws Exception {
    Socket s = new Socket("localhost", 3333);
    DataInputStream din = new DataInputStream(s.getInputStream());
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String strReceive = "", strSend = "";
    while (!strSend.equals("stop")) {
      if (strReceive.equals("")) {
        strReceive = din.readUTF();
        System.out.println("JATS: " + strReceive);
      }
      strReceive = din.readUTF();
      System.out.println("Nasabah says: " + strReceive);
      strSend = br.readLine();
      dout.writeUTF(strSend);
      dout.flush();
    }
    dout.close();
    s.close();
  }
}
