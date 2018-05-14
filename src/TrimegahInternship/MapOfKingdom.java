package TrimegahInternship;

import java.util.*;

public class MapOfKingdom {
  public static void main(String[] args) {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    Scanner input = new Scanner(System.in);
    int totalCases = input.nextInt();

    int counter = 1;
    while (counter <= totalCases) {
      int n = input.nextInt();
      int m = input.nextInt();

      ArrayList<String> factions = new ArrayList<>();
      ArrayList<String> contestedFactions = null;
      Set<String> uniqueSet = null;
      int contested = 0;

      for (int i = 0; i < n; i++) {
        String region = input.next();
        contestedFactions = new ArrayList<>();
        for (char element : region.toCharArray()) {
          for (char letter : alphabet) {
            if (element == letter) {
              factions.add(String.valueOf(element));
              contestedFactions.add(String.valueOf(element));
            }
          }
        }
        uniqueSet = new HashSet<String>(contestedFactions);
        if (uniqueSet.size() > 1)
          contested++;
      }

      uniqueSet = new HashSet<String>(factions);
      System.out.println("Case " + counter + ": ");

      for (String element : uniqueSet)
        System.out.println(element + " " + Collections.frequency(factions, element));

      System.out.println("contested " + contested);

      counter++;
    }
  }
}
