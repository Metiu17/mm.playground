package mm.playground.chess;

public class ChessMain {
    public static void main(String[] args) {
        // A-H x 1-8, A1 Black
        char[][] board = createChessBoard();
        placePawns(board);
        printBoard(board);
        int startingRow = 1;
        int startingColumn = 2;
        if (movePawn(board, startingRow, startingColumn, PawnMoves.MOVE1)) {
            System.out.println("Pawn in (" + startingRow + "," + startingColumn + ") moved!");
        } else {
            System.out.println("Cannot perform move for pawn in (" + startingRow + "," + startingColumn + ")!");
        }
        printBoard(board);
    }

    private static boolean movePawn(char[][] board, int startingRow, int startingColumn, PawnMoves move) {
        if (!isPawnPresent(board, startingRow, startingColumn)) {
            return false;
        }
        PawnMoves.makeMove(board, startingRow, startingColumn, move);
        return true;
    }

    public static void performMove(char[][] board, int startRow, int startColumn, int finalRow, int finalColumn) {
        char piece = board[startRow][startColumn];
        board[startRow][startColumn] = ' ';
        board[finalRow][finalColumn] = piece;
    }


    private static boolean isPawnPresent(char[][] board, int rowIndex, int columnIndex) {
        if (board[rowIndex][columnIndex] == 'P') {
            return true;
        } else {
            return false;
        }
    }

    private static void placePawns(char[][] board) {
        placePawnRow(board, 1);
        placePawnRow(board, board.length - 2);
    }

    private static void placePawnRow(char[][] board, int rowIndex) {
        int columnNumber = board[rowIndex].length;
        for (int columnIndex = 0; columnIndex < columnNumber; ++columnIndex) {
            board[rowIndex][columnIndex] = 'P';
        }
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
        for (int rowIndex = 0; rowIndex < board.length; ++rowIndex) {
            for (int columnIndex = 0; columnIndex < board[rowIndex].length; ++columnIndex) {
                board[rowIndex][columnIndex] = ' ';
            }
        }
        return board;
    }
}
