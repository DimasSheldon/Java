package EKPL2.HomeWork.February23_FactoryDesign.Factory;

import EKPL2.HomeWork.February23_FactoryDesign.AbstractClass.PackagingDesign;
import EKPL2.HomeWork.February23_FactoryDesign.Subclass.Cube;
import EKPL2.HomeWork.February23_FactoryDesign.Subclass.Cuboid;
import EKPL2.HomeWork.February23_FactoryDesign.Subclass.Cylinder;

/**
 * Created by Sheldon on 2/22/2017.
 * A factory class of package designing.
 */
public class PackagingFactory {
  /**
   * A method to construct an object of packaging design.
   * @param packType the shape type of packaging
   * @param packSize the size of packaging in scale code (L, M, or S)
   * @param thickness the thickness of packaging in millimeters
   * @return the package design
   */
  public PackagingDesign makePackaging(char packType, char packSize, int thickness) {
    PackagingDesign pack = null;

    switch (packType) {
      case ('O'):
      case ('o'):
        pack = new Cuboid(packSize, thickness);
        break;

      case ('E'):
      case ('e'):
        pack = new Cube(packSize, thickness);
        break;

      case ('I'):
      case ('i'):
        pack = new Cylinder(packSize, thickness);
        break;
    }

    return pack;
  }
}