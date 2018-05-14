package TrimegahInternship;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleByK {
  public static void main(String[] args) {
    Scanner mainInput = new Scanner(System.in);
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> casesResult = new ArrayList<>();

    int cases = mainInput.nextInt();

    int counter = 1;
    while (counter <= cases) {
      int A = input.nextInt();
      int B = input.nextInt();
      int denominator = input.nextInt();

      ArrayList<Integer> divisibleByK = new ArrayList<>();
      for (int i = A; i <= B; i++) {
        if (i % denominator == 0) {
          divisibleByK.add(i);
        }
      }
      casesResult.add(divisibleByK.size());
      counter += 1;
    }
    for (int i = 0; i < casesResult.size(); i++) {
      System.out.println("Case " + (i + 1) + ": " + casesResult.get(i));
    }
  }
}