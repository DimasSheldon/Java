import java.util.*;

public class test {
  public static void main(String[] args) {
//    int N = 2;
//    int M = 2;
//    char[][] charArr = new char[N][M];
//    String words = "ab\nba";
//    System.out.println(words.length());
//
//    System.out.println(charArr.length);
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < M; j++) {
//        charArr[i][j] = 'a';
//      }
//    }
//
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < M; j++) {
//        System.out.println(charArr[i][j]);
//      }
//    }
//    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//    String str = ".aabc";
//
//    char faction1 = '\0';
//    char faction2 = '\0';
//    int count = 0;
//
//    boolean foundFaction1 = false;
//    boolean contested = false;
//
//    for (char e : str.toCharArray()) {
//      for (char letters : alphabet) {
//        if (e == letters) {
//          if (!foundFaction1) {
//            faction1 = e;
//            foundFaction1 = true;
//          } else {
//            faction2 = e;
//            if (faction2 != faction1)
//              contested = true;
//          }
//        }
//      }
//      if (contested) {
//        count += 1;
//        break;
//      }
//    }
//
//    System.out.println("Faction 1: " + faction1);
//    System.out.println("Faction 2: " + faction2);
//    System.out.println("contested " + count);
//    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//
//    Scanner input = new Scanner(System.in);
//    int totalCases = input.nextInt();
//
//    int counter = 1;
//    while (counter <= totalCases) {
//      int n = input.nextInt();
//      int m = input.nextInt();
//
//      ArrayList<String> factions = new ArrayList<>();
//      ArrayList<String> contestedFactions = null;
//      Set<String> uniqueSet = null;
//      int contested = 0;
//
//      for (int i = 0; i < n; i++) {
//        String region = input.next();
//        for (char e : region.toCharArray()) {
//          for (char letters : alphabet) {
//            if (e == letters) {
//              factions.add(String.valueOf(e));
//              contestedFactions = new ArrayList<>();
//              contestedFactions.add(String.valueOf(e));
//              uniqueSet = new HashSet<String>(contestedFactions);
//              if (uniqueSet.size() > 1) {
//                contested++;
//              }
//            }
//          }
//        }
//      }
//
//      uniqueSet = new HashSet<String>(factions);
//      if (uniqueSet.size() > 1)
//        contested++;
//      System.out.println("Case " + counter + ": ");
//
//      for (String element : uniqueSet) {
//        System.out.println(element + " " + Collections.frequency(factions, element));
//      }
//      System.out.println("contested " + contested);
//
//      counter++;
//    }
    int a = 4;
    int b = 7;
    System.out.println(a & b);
  }
}
