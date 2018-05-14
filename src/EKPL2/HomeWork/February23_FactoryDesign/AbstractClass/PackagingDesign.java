package EKPL2.HomeWork.February23_FactoryDesign.AbstractClass;

/**
 * Created by Sheldon on 2/22/2017.
 * An abstraction class of packaging design.
 * Design of a packaging can be come from different shape type (e.g. cylinder, cube, or cuboid),
 * all of shape has size and thickness property, but with its specific composition.
 */

public abstract class PackagingDesign {
  protected String size;
  protected int thickness;

  /**
   * A method to genereate size composition of package object in centimeters.
   * @return the size composition
   */
  public abstract String getSize();

  /**
   * A method to generate packaging design information
   * @return the packaging design information
   */
  public String info() {
    return "Package type\t\t: " + getClass().getSimpleName() +
            "\nPackage size\t\t: " + getSize() +
            "\nPackage thickness\t: " + Integer.toString(thickness) + "mm";
  }
}