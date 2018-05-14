package DistributedSystem.JSON;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
  public static void main(String[] args) throws Exception {
    // Buat socket
    int port = 80;
    ServerSocket serverSocket = new ServerSocket(port);
    System.err.println("Server Ready at port : " + port);

    // repeatedly wait for connections, and process
    while (true) {
      Socket clientSocket = serverSocket.accept();
      System.err.println("Terima request dari client");

      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

      String s;
      s = in.readLine();
      System.out.println(s);

      // Splitting get message with " "
      String[] split = s.split(" ");

      // Splitting get message with "/"
      split = split[1].split("/");
      System.out.println(split[1]);

      // Storing split result
      String fileRequest = split[1];

      while ((s = in.readLine()) != null) {
        System.out.println(s);
        if (s.isEmpty()) {
          break;
        }
      }

      try {
        File myFile = new File(fileRequest);

        FileInputStream fis = new FileInputStream(myFile);
        DataInputStream din = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(din));
        String line;

        while ((line = br.readLine()) != null) {
          System.out.println(line);
          out.write(line);
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }

      // Tutup Koneksi
      System.err.println("Data telah dikirimkan dan client siap di tutup kembali");
      out.close();
      in.close();
      clientSocket.close();
    }
  }
}