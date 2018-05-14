package EKPL2.ReUTS;

/**
 * Created by Sheldon on 3/29/2017.
 */

public class TermometerAdapter extends ConvertTermometer implements Termometer {
  private double tempInF;

  public TermometerAdapter() {
    tempInF = 0;
  }

  @Override
  public double convertCtoF(double tempInC) {
    return (tempInC * 9.0 / 5.0) + 32.0;
  }

  public void setTemp(double tempInC) {
    tempInF = convertCtoF(tempInC);
    System.out.println(tempInF);
  }

  public double getTemp(char option) {
    double result;
    switch (option) {
      case 'K':
      case 'k':
        result = convertFtoK(tempInF);
        break;
      case 'R':
      case 'r':
        result = convertFtoR(tempInF);
        break;
      default:
        result = 0;
        break;
    }
    return result;
  }
}