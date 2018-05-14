package EKPL2.ReUTSTobias;

/**
 * Created by Tobias on 27/03/2017.
 */
public class ThermometerAdapter extends ConvertThermometer implements Thermometer {
    private double celcius, fahrenheit;
    @Override
    public void setTemp(double tempInC) {
        celcius = tempInC;
        System.out.println("Fahrenheit = " + convertCtoF(celcius) + "\u00B0F");
    }
    @Override
    public double convertCtoF(double tempInC) {
        fahrenheit = (tempInC*9/5) + 32;
        return fahrenheit;
    }
    @Override
    public double getTemp(char option) {
        if (option == 'r' || option == 'R'){
            return convertFtoR(fahrenheit);
        }
        else {
            return convertFtoK(fahrenheit);
        }
    }
}
