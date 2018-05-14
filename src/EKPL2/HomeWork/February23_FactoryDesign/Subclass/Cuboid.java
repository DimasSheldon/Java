package EKPL2.HomeWork.February23_FactoryDesign.Subclass;

import EKPL2.HomeWork.February23_FactoryDesign.AbstractClass.PackagingDesign;

/**
 * Created by Sheldon on 2/22/2017.
 */
public class Cuboid extends PackagingDesign {
  private char sizeIn;

  /**
   * A constructor of cuboid package object.
   * @param size the size code of package
   * @param thickness the thickness of package
   */
  public Cuboid(char size, int thickness) {
    sizeIn = size;
    this.thickness = thickness;
  }

  /**
   * A method to determine packaging size composition based on size code given
   * @return the size composition
   */
  public String getSize() {
    // Large size
    double widthL  = 50, lengthL = 40, heightL = 20;
    // Medium size
    double widthM = 40, lengthM = 30, heightM = 10;
    // Small size
    double widthS = 30, lengthS = 20, heightS = 10;

    switch (sizeIn) {
      case ('L'):
      case ('l'):
        this.size = Double.toString(widthL) + "cm x " + Double.toString(lengthL) + "cm x " + Double.toString(heightL) + "cm";
        break;
      case ('M'):
      case ('m'):
        this.size = Double.toString(widthM) + "cm x " + Double.toString(lengthM) + "cm x " + Double.toString(heightM) + "cm";
        break;
      case ('S'):
      case ('s'):
        this.size = Double.toString(widthS) + "cm x " + Double.toString(lengthS) + "cm x " + Double.toString(heightS) + "cm";
        break;
    }
    return this.size;
  }
}