package DistributedSystem.ChatBot;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatBotServer {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(3333);

    Socket s1 = ss.accept();

    DataInputStream din1 = new DataInputStream(s1.getInputStream());
    DataOutputStream dout1 = new DataOutputStream(s1.getOutputStream());

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    String str = ""; String str2 = "";
    while (!str.equals("stop")) {
      str = din1.readUTF();
      System.out.println("client says: " + str);
      if (str.contains("nama") || str.contains("Nama") || str.contains("Name")) {
        System.out.println("Nama saya adalah ITHB ChatBot");
      } else if (str.contains("alamat") || str.contains("Alamat") || str.contains("Address")) {
        System.out.println("Alamat saya di Jln. Dipati Ukur No. 80-84, Bandung");
      } else {
        System.out.println("Silahkan bertanya");
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