  package boardgame;

  public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();      
        chessBoard.displayBoard();
        chessBoard.moveFigure("Bsb2", 5,4);
        chessBoard.displayBoard();       
         chessBoard.moveFigure("Bsb2", 1,8);
        chessBoard.displayBoard();       
        chessBoard.moveFigure("Bsw1", 4,5);
        chessBoard.displayBoard();       
        chessBoard.moveFigure("Bsb2", 4,5);
        chessBoard.displayBoard();       
    }
}
