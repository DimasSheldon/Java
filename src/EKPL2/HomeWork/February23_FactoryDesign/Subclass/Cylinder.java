package EKPL2.HomeWork.February23_FactoryDesign.Subclass;

import EKPL2.HomeWork.February23_FactoryDesign.AbstractClass.PackagingDesign;

/**
 * Created by Sheldon on 2/22/2017.
 */
public class Cylinder extends PackagingDesign {
  private char sizeIn;

  /**
   * A constructor of cylinder package object.
   * @param size the size code of package
   * @param thickness the thickness of package
   */
  public Cylinder(char size, int thickness) {
    sizeIn = size;
    this.thickness = thickness;
  }

  /**
   * A method to determine packaging size composition based on size code given
   * @return the size composition
   */
  public String getSize() {
    // large, medium, and small size
    double radiusL = 40, radiusM = 30, radiusS = 10;
    double heightL = 30, heightM = 20, heightS = 10;

    switch (sizeIn) {
      case ('L'):
      case ('l'):
        this.size = Double.toString(radiusL) + "cm of radius, "
                + Double.toString(heightL) + "cm of height";
        break;
      case ('M'):
      case ('m'):
        this.size = Double.toString(radiusM) + "cm of radius, "
                + Double.toString(heightM) + "cm of height";;
        break;
      case ('S'):
      case ('s'):
        this.size = Double.toString(radiusS) + "cm of radius, "
                + Double.toString(heightS) + "cm of height";;
        break;
    }
    return this.size;
  }
}