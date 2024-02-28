package boardgame;

public class ChessBoard {
    public static int size = 8;
    public Figure[][] board = new Figure[size][size];
    char[] letters = { '1', '2', '3', '4', '5', '6', '7', '8' };

    public ChessBoard() {
        setBoard();
    }

    public void moveFigure(String name, int destX, int destY) {
        Figure figure = getFigure(name);
        if (figure == null) {
            System.out.println("Figure not found");
            return;
        }
    
        Figure destFigure = board[destX - 1][destY - 1];
        if (destFigure != null && destFigure.getColor() == figure.getColor()) {
            System.out.println("Cannot move to position: Same color piece already exists");
            return;
        }
    
        if (figure.freeMove(this, destX, destY)) {
            if (destFigure != null) {
                System.out.println("Move and capture " + destFigure.getName());
                board[destX - 1][destY - 1] = null; // ลบ Figure ที่ตำแหน่งปลายทาง
            }
    
            board[figure.x - 1][figure.y - 1] = null;
            figure.x = destX;
            figure.y = destY;
            board[destX - 1][destY - 1] = figure;
        } else {
            System.out.println("Cannot move to position");
        }
    } 
    public void displayBoard() {
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print("    ");
            System.out.print(letters[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getName() + " ");
                } else {
                    System.out.print("---- ");
                }
            }
            System.out.println("|");
        }
    }

    public Figure getFigure(int nrow, int ncol) {
        if (nrow < 0 || nrow >= size || ncol < 0 || ncol >= size) {
            return null;
        }

        return board[nrow][ncol];
    }

    // New method to set a figure on the board
    public void setBoard() {
        board[0][1] = new Bishop("Bsw1", true, 1, 2);
        board[0][6] = new Bishop("Bsw2", true, 1, 7);
        board[7][1] = new Bishop("Bsb1", false, 8, 2);
        board[7][6] = new Bishop("Bsb2", false, 8, 7);
        board[0][0] = new Rook("Row1", true, 1, 1);

    }

    public Figure getFigure(String name) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null && board[i][j].getName().equals(name)) {
                    return board[i][j];
                }
            }
        }
        return null;
    }
    

}
