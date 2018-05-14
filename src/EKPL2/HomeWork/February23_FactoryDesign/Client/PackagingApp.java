/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EKPL2.HomeWork.February23_FactoryDesign.Client;

/**
 * @author SKEL-Yoyok
 */

import EKPL2.HomeWork.February23_FactoryDesign.Factory.PackagingFactory;
import EKPL2.HomeWork.February23_FactoryDesign.AbstractClass.PackagingDesign;

import java.util.Scanner;


public class PackagingApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    boolean validIn = false;
    char packType = '\0';
    char packSize = '\0';
    char charThickness = '0';
    int thickness = 0;

    Scanner userIn = new Scanner(System.in);
    while (!validIn) {
      System.out.print("Packaging type Cub(e) / Cyl(i)nder / Cub(o)id: ");
      //userIn = new Scanner(System.in);
      if (userIn.hasNextLine())
        packType = userIn.nextLine().charAt(0);
      switch (packType) {
        case ('O'):
        case ('o'):
        case ('E'):
        case ('e'):
        case ('I'):
        case ('i'):
          validIn = true;
          break;
        default:
          System.out.println("Unregistered option!");
          break;
      }
    }

    validIn = false;
    while (!validIn) {
      System.out.print("Packaging size (L)arge / (M)edium / (S)mall: ");
      //userIn = new Scanner(System.in);
      if (userIn.hasNextLine())
        packSize = userIn.nextLine().charAt(0);
      switch (packSize) {
        case ('L'):
        case ('M'):
        case ('S'):
        case ('l'):
        case ('m'):
        case ('s'):
          validIn = true;
          break;
        default:
          System.out.println("Unregistered option!");
          break;
      }
    }

    validIn = false;
    while (!validIn) {
      System.out.print("Package thickness in mm 1 / 2 / 3: ");
      if(userIn.hasNextLine())
        charThickness = userIn.nextLine().charAt(0);
      switch(charThickness) {
        case('1'):case('2'):case('3'):
        {
          thickness = Integer.parseInt(String.valueOf(charThickness));
          validIn = true;
        }
        break;
        default:
          System.out.println("Unregistered option!");
          break;
      }
    }

    System.out.println();
    System.out.printf("%27s%n%27s%n", "Packaging Design","================");
    //====================================================================
    PackagingFactory pf = new PackagingFactory();
    PackagingDesign pack = pf.makePackaging(packType, packSize, thickness);
    System.out.println(pack.info());
    //====================================================================
  }
}