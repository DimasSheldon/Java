package TrickySolutions;

import java.text.DecimalFormat;

/**
 * Created by Sheldon on 10/26/2016.
 * Change a double or float dataTypes to only x decimals
 */
public class DecimalFormatter {
    public static void main(String[] args) {
        double theNumber = 12.3456789;
        DecimalFormat theNumberFormatter = new DecimalFormat("#.##");
        String theNumberFormatted = theNumberFormatter.format(theNumber);
        System.out.println(theNumberFormatted);

        // OR

        double myNumber = 12.34567;
        String myNumberFormatted = new DecimalFormat("#.###").format(myNumber);
        System.out.println(myNumberFormatted);

    }
}
