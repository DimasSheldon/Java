package DistributedSystem.ChatBot2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatBotServer2 {

  public static void main(String args[]) {
    Socket s = null;
    ServerSocket ss2 = null;
    System.out.println("Server Listening...");
    try {
      ss2 = new ServerSocket(4445); // can also use static final PORT_NUM , when defined
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Server error");
    }
    while (true) {
      try {
        s = ss2.accept();
        System.out.println("connection Established");
        ChatBotServerThread st = new ChatBotServerThread(s);
        st.start();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Connection Error");
      }
    }
  }
}

class ChatBotServerThread extends Thread {
  String line = null;
  BufferedReader is = null;
  PrintWriter os = null;
  Socket s = null;

  String[] input;

  public ChatBotServerThread(Socket s) {
    this.s = s;
  }

  public void run() {
    try {
      is = new BufferedReader(new InputStreamReader(s.getInputStream()));
      os = new PrintWriter(s.getOutputStream());
    } catch (IOException e) {
      System.out.println("IO error in server thread");
    }
    try {
      line = is.readLine();
      input = line.split("_");

      while (line.compareTo("QUIT") != 0) {
//        os.println(line);

//        if (line.contains("nama")
//                || line.contains("Nama")
//                || line.contains("Name")) {
//          os.println("Nama saya adalah ITHB ChatBot");
//        } else if (line.contains("alamat")
//                || line.contains("Alamat")
//                || line.contains("address")) {
//          os.println("Alamat saya di Jln. Dipati Ukur No. 80-84, Bandung");
//        } else if (line.contains("usia")
//                || line.contains("umur")
//                || line.contains("age")) {
//          os.println("Saat ini saya berusia 15 tahun");
//        } else {
//          os.println("Silahkan pertanyaan lainnya");
//        }

        for (int i = 0; i < input.length; i++) {
          if (input[i].contains("nama")) {
            os.println("Hehe");
          }
        }

        os.flush();
        System.out.println("Response to Client  :  " + line);

        line = is.readLine();
      }
    } catch (IOException e) {
      line = this.getName(); //reused String line for getting thread name
      System.out.println("IO Error/ Client " + line + " terminated abruptly");
    } catch (NullPointerException e) {
      line = this.getName(); //reused String line for getting thread name
      System.out.println("Client " + line + " Closed");
    } finally {
      try {
        System.out.println("Connection Closing..");
        if (is != null) {
          is.close();
          System.out.println(" Socket Input Stream Closed");
        }
        if (os != null) {
          os.close();
          System.out.println("Socket Out Closed");
        }
        if (s != null) {
          s.close();
          System.out.println("Socket Closed");
        }
      } catch (IOException ie) {
        System.out.println("Socket Close Error");
      }
    }//end finally
  }
}