package EKPL2.HomeWork.February23_FactoryDesign.Subclass;

import EKPL2.HomeWork.February23_FactoryDesign.AbstractClass.PackagingDesign;

/**
 * Created by Sheldon on 2/22/2017.
 * An implementing class of Packaging Design class.
 */
public class Cube extends PackagingDesign {
  private char sizeIn;

  /**
   * A constructor of cubical package object.
   * @param size the size code of package
   * @param thickness the thickness of package
   */
  public Cube(char size, int thickness) {
    sizeIn = size;
    this.thickness = thickness;
  }

  /**
   * A method to determine packaging size composition based on size code given
   * @return the size composition
   */
  public String getSize() {
    // large, medium, and small size
    double sideL = 50, sideM = 30, sideS = 20;

    switch (sizeIn) {
      case ('L'):
      case ('l'):
        this.size = Double.toString(sideL) + "cm x " + Double.toString(sideL) + "cm x " + Double.toString(sideL) + "cm";
        break;
      case ('M'):
      case ('m'):
        this.size = Double.toString(sideM) + "cm x " + Double.toString(sideM) + "cm x " + Double.toString(sideM) + "cm";
        break;
      case ('S'):
      case ('s'):
        this.size = Double.toString(sideS) + "cm x " + Double.toString(sideS) + "cm x " + Double.toString(sideS) + "cm";
        break;
    }
    return this.size;
  }
}