package boardgame;

public class Main {
  public static void main(String[] args) {
    ChessBoard chessBoard = new ChessBoard();
    chessBoard.displayBoard();
    chessBoard.moveFigure("Bsw1", 4, 5);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Bsw1", 1, 8);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Bsw1", 5, 4);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Bsb2", 6, 5);
    chessBoard.displayBoard();
    // chessBoard.moveFigure("Row1", 3, 1);
    // chessBoard.displayBoard();
    // chessBoard.moveFigure("Row1", 2, 6);
    // chessBoard.moveFigure("Knb1", 3, 1);
    // chessBoard.displayBoard();
  }
}
