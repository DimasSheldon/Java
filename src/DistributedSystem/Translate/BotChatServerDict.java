package DistributedSystem.ChatBot2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class BotChatServerDict {

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
        BotChatServerThreadDict st = new BotChatServerThreadDict(s);
        st.start();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Connection Error");
      }
    }
  }
}

class BotChatServerThreadDict extends Thread {
  final String DEFAULT_RESPONSE = ".....";

  String line = null;
  BufferedReader is = null;
  PrintWriter os = null;
  Socket s = null;

  Map<String, String> dictionary = new HashMap<String, String>();

  public BotChatServerThreadDict(Socket s) {
    this.s = s;
  }

  public String translate(String word) {
    if (dictionary.containsKey(word)) {
      return dictionary.get(word);
    } else {
      return word;
    }
  }

  public void run() {

    dictionary.put("saya", "I");
    dictionary.put("aku", "I");
    dictionary.put("adalah", "am");
    dictionary.put("mahasiswa", "student");
    dictionary.put("memasak", "cook");
    dictionary.put("kamu", "you");
    dictionary.put("bisa", "can");
    dictionary.put("gigi", "tooth");
    dictionary.put("roti", "bread");
    dictionary.put("merah muda", "pink");
    dictionary.put("ganteng", "handsome");
    dictionary.put("cantik", "beautiful");
    dictionary.put("matahari", "sun");
    dictionary.put("dan", "and");
    dictionary.put("kursi", "chair");
    dictionary.put("buku", "book");
    dictionary.put("biru", "blue");
    dictionary.put("hitam", "black");
    dictionary.put("guru", "teacher");
    dictionary.put("kartu", "card");
    dictionary.put("kelas", "class");
    dictionary.put("nama", "name");
    dictionary.put("lagi", "more");
    dictionary.put("ungu", "purple");
    dictionary.put("hewan", "animal");
    dictionary.put("cinta", "love");

    try {
      is = new BufferedReader(new InputStreamReader(s.getInputStream()));
      os = new PrintWriter(s.getOutputStream());

    } catch (IOException e) {
      System.out.println("IO error in server thread");
    }

    try {


      line = is.readLine();
      String response = "";
      while (line.compareTo("QUIT") != 0) {

        System.out.println("Client Say : " + line);
        String[] words = line.split(" ");
        for (String word : words) {
          response = response + " " + translate(word);
        }
        os.println(response);
        os.flush();
        System.out.println("Response to Client  :  " + response);
        line = is.readLine();
        response = "";
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