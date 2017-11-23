package mm.playground.chess;

public class ChessMain {
  public static void main(String[] args) {
    // A-H x 1-8, A1 Black
    char[][] board = createChessBoard();
    placePawns(board);
    printBoard(board);
  }

    private static void placePawns(char[][] board) {

    }

    private static void printBoard(char[][] board) {
    for (int i = 0; i < board.length; ++i) {
      char[] row = board[i];
      for (int j = 0; j < row.length; j++) {
        System.out.print("--");
      }
      System.out.println('-');
      for (int j = 0; j < row.length; ++j) {
        System.out.print("|" + board[i][j]);
      }
      System.out.println('|');
    }
    for (int j = 0; j < board[board.length - 1].length; ++j) {
      System.out.print("--");
    }
    System.out.println('-');
  }

  private static char[][] createChessBoard() {
    char[][] board = new char[8][8];
    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board.length; ++j) {
        board[i][j] = ' ';
      }
    }
    return board;
  }
}
