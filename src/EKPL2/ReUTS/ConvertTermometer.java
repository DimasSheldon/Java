package EKPL2.ReUTS;

/**
 * Created by Sheldon on 3/29/2017.
 */
public abstract class ConvertTermometer {

  abstract public double convertCtoF(double tempInC);

  public double convertFtoR(double tempInF) {
    return ((4.0 / 9.0) * (tempInF - 32.0));
  }

  public double convertFtoK(double tempInF) {
//    System.out.println("this is from f to k");
    return ((5.0 / 9.0) * (tempInF - 32.0) + 273.0);
//  }
  }
}
