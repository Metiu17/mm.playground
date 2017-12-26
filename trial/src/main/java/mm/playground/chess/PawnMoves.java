package mm.playground.chess;

public enum PawnMoves {
    MOVE1, MOVE2, CATCH_RIGHT, CATCH_LEFT;

    public static void makeMove(char[][] board, int startRow, int startColumn, PawnMoves move) {
        if (move == MOVE1) {
            //TODO check if some piece prevent the pawn from moving
            int finalRow;
            if (startRow == 1) {
                finalRow = startRow + 1;
            } else {
                finalRow = startRow - 1;
            }
            ChessMain.performMove(board, startRow, startColumn, finalRow, startColumn);
        }

        // TODO implement MOVE2
        // TODO implement CATCH_RIGHT
        // TODO implement CATCH_LEFT
        // for the moment being always assume starting from initial rows
        // thus, pieces in row 1 move onward with rowIndex increment
        // while pieces in row n-2 move onward decrementing row index
    }
}

