package TryAndTry;

import java.util.ArrayList;
import java.util.Scanner;

/*
empty     .
mountain  #
armies    alphabets
 */
public class MapOfKingdomFailed {
  private final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  private char[][] board;
  private ArrayList<String> str;
  private ArrayList<String> factions;
  private char faction = '\0';
  private int n;
  private int m;

  public MapOfKingdomFailed(int n, int m) {
    this.n = n;
    this.m = m;
    board = new char[n][m];
    str = new ArrayList<>();
    factions = new ArrayList<>();
  }

  public void findMatch(String words) {
    for (int i = 0; i < n; i++) {
      str.add(words);
      for (int j = 0; j < m; j++) {
        for (char letter : ALPHABET) {
          faction = str.get(i).charAt(j);
          if (faction == letter)
            factions.add(String.valueOf(faction));
        }
      }
    }
  }

  public ArrayList<String> getFactions() {
    return factions;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalCases = input.nextInt();
    int n = input.nextInt();
    int m = input.nextInt();

    MapOfKingdomFailed mapOfKingdom = new MapOfKingdomFailed(n, m);

    int counter = 1;
    while (counter <= totalCases) {
      String words = input.next();
      mapOfKingdom.findMatch(words);
      counter++;
    }

    System.out.println(mapOfKingdom.getFactions());
  }
}