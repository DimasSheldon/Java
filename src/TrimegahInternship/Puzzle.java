//package TrimegahInternship;
//
//public class Puzzle {
//  private int count;
//  public Puzzle() {this.count = 0;}
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
//  public int getCount() {
//    return count;
//  }
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
//
//    return false;
//  }
//
//  public static void main(String[] args) {
//    char[][] charArr = new char[2][4];
//    charArr[0][0] = 'd';
//    charArr[0][1] = 'o';
//    charArr[0][2] = 'g';
//    charArr[0][3] = 'g';
//    charArr[1][0] = 'g';
//    charArr[1][1] = 'd';
//    charArr[1][2] = 'o';
//    charArr[1][3] = 'g';
//
////    for (int i = 0; i < 2; i++) {
////      for (int j = 0; j < 4; j++) {
////        System.out.println(charArr[i][j]);
////      }
////    }
//
//    Puzzle thePuzzle = new Puzzle();
//    System.out.println(thePuzzle.exist(charArr, "dog"));
//    System.out.println(thePuzzle.getCount());
//  }
//}