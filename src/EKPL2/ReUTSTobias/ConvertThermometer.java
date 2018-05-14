package EKPL2.ReUTSTobias;

/**
 * Created by Tobias on 27/03/2017.
 */
public abstract class ConvertThermometer {
    public abstract double convertCtoF(double tempInC);

    public double convertFtoR(double tempInF){
        double reamur = (tempInF - 32) * 4/9;
        System.out.println("Reamur = " + reamur + "\u00B0R");
        return reamur;
    }

    public double convertFtoK(double tempInF){
        double kelvin = ((tempInF - 32) * 5/9) + 273;
        System.out.println("Kelvin = " + kelvin + "K");
        return kelvin;
    }
}
