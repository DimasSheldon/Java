package TrickySolutions;

/**
 * Created by Sheldon on 10/26/2016.
 */
public class DataTypeConversion {
    public static void main(String[] args) {
        double theNumber = 90.09;
        float theNumberToFloat = (float) theNumber;
        System.out.println(theNumberToFloat);

        int theNumberToInt = (int)theNumber;
        System.out.println(theNumberToInt);
    }
}
