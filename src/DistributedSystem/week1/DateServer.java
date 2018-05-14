package DistributedSystem.week1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {

  /**
   * Runs the server.
   */
  public static void main(String[] args) throws IOException {
    ServerSocket listener = new ServerSocket(9099);
//    ServerSocket listener = new ServerSocket(8888);
    try {
      System.out.println("Server's up and running...");
      while (true) {
        Socket socket = listener.accept();
        try {
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
          out.println(new Date().toString());

          String name = "Triandi Shafa";
          String nim = "1415009";

          PrintWriter out_scnd = new PrintWriter(socket.getOutputStream(), true);
          out_scnd.println("Name: " + name);
          PrintWriter out_thrd = new PrintWriter(socket.getOutputStream(), true);
          out_thrd.println("NIM: " + nim);
        } finally {
          socket.close();
        }
      }
    } finally {
      listener.close();
    }
  }
}