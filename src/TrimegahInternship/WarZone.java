//package TrimegahInternship;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class WarZone {
//  private int count;
//
//  public WarZone() {
//    this.count = 0;
//  }
//
//  public boolean exist(char[][] board, String word) {
//    int m = board.length;
//    int n = board[0].length;
//
//    boolean result = false;
//    for (int i = 0; i < m; i++) {
//      for (int j = 0; j < n; j++) {
//        if (dfs(board, word, i, j, 0)) {
//          result = true;
//          count += 1;
//        }
//      }
//    }
//    return result;
//  }
//
//  public boolean dfs(char[][] board, String word, int i, int j, int k) {
//    int m = board.length;
//    int n = board[0].length;
//
//    if (i < 0 || j < 0 || i >= m || j >= n) {
//      return false;
//    }
//
//    if (board[i][j] == word.charAt(k)) {
//      char temp = board[i][j];
//      board[i][j] = '#';
//      if (k == word.length() - 1) {
//        return true;
//      } else if (dfs(board, word, i - 1, j, k + 1)
//              || dfs(board, word, i + 1, j, k + 1)
//              || dfs(board, word, i, j - 1, k + 1)
//              || dfs(board, word, i, j + 1, k + 1)) {
//        return true;
//      }
//      board[i][j] = temp;
//    }
//    return false;
//  }
//
//  public int getCount() {
//    return count;
//  }
//
//  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    int cases = input.nextInt();
////    char[][] board;
////    ArrayList<String> str;
////    String toFind;
//
//    int counter = 1;
//    while (counter <= cases) {
//      int n = input.nextInt();
//      int m = input.nextInt();
//      char[][] board = new char[n][m];
//      ArrayList<String> str = new ArrayList<>();
//
//      for (int i = 0; i < n; i++) {
//        String words = input.next();
//        str.add(words);
//      }
//
//      for (int i = 0; i < n; i++) {
//        for (int j = 0; j < m; j++) {
//          board[i][j] = str.get(i).charAt(j);
//          System.out.println(board[i][j]);
//        }
//      }
////      String toFind = input.next();
////
//      WarZone warZone = new WarZone();
//      warZone.exist(board, toFind);
////
////      System.out.println("Case " + counter + ": " + warZone.getCount());
//
//      counter += 1;
//    }
//  }
//}
