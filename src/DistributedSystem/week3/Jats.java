package DistributedSystem.week3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Jats {
  private static ServerSocket ss = null;
  private static Socket sNasabah = null, sBroker = null;
  private static DataInputStream dinNasabah, dinBroker;
  private static DataOutputStream doutNasabah, doutBroker;
  private static BufferedReader brKios, brPusat;

  public static void connectClientKios(ServerSocket ss){
    try {
      sNasabah = ss.accept();
      System.out.println("Client Nasabah detected");
      dinNasabah = new DataInputStream(sNasabah.getInputStream());
      doutNasabah = new DataOutputStream(sNasabah.getOutputStream());
      brKios = new BufferedReader(new InputStreamReader(System.in));
      doutNasabah.writeUTF("Anda adalah Nasabah");
      doutNasabah.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static void connectClientPusat(ServerSocket ss){
    try {
      sBroker = ss.accept();
      System.out.println("Client Broker detected");
      dinBroker = new DataInputStream(sBroker.getInputStream());
      doutBroker = new DataOutputStream(sBroker.getOutputStream());
      brPusat = new BufferedReader(new InputStreamReader(System.in));
      doutBroker.writeUTF("Anda adalah Broker");
      doutBroker.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[])throws Exception{
    ss = new ServerSocket(3333);
    System.out.println("Jakarta Automatic Trading System Ready...");
    connectClientKios(ss);
    connectClientPusat(ss);
    String strRecieve = "", strSend;
    while(!strRecieve.equals("stop")){
//From Nasabah to Broker
      strRecieve = dinNasabah.readUTF();
      System.out.println("Nasabah says: "+strRecieve);
      strSend = strRecieve;
      doutBroker.writeUTF(strSend);
      doutBroker.flush();
//Confirm
      strRecieve = dinBroker.readUTF();
      System.out.println("Broker says: "+strRecieve);
      strSend = strRecieve;
      doutNasabah.writeUTF(strSend);
      doutNasabah.flush();
    }
    dinNasabah.close();
    sNasabah.close();
    ss.close();
  }
}
