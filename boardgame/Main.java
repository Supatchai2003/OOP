package boardgame;

public class Main {
  public static void main(String[] args) {
    ChessBoard chessBoard = new ChessBoard();
    chessBoard.displayBoard();
    
    chessBoard.moveFigure("Paw4", 4, 4);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Paw3", 4, 3);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Pab3", 5, 3);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Paw3", 5, 3);
    chessBoard.displayBoard();
    chessBoard.moveFigure("Pab3",4, 4);
    chessBoard.displayBoard();
  }
}
