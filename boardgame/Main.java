  package boardgame;

  public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();      
        chessBoard.displayBoard();
       // chessBoard.moveFigure("Row1", 2,7 );
       chessBoard.moveFigure("Bsw2", 5,6 );
        chessBoard.displayBoard();
        // chessBoard.moveFigure("Rw1", 3, 2);
        // chessBoard.displayBoard();
       
    }
}
