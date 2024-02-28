package boardgame;

public class Knight extends Figure {
    public Knight(String name, boolean color, int x, int y) {
        super(name, color, x, y);
    }

    @Override
    public boolean freeMove(ChessBoard board, int destX, int destY) {
        int dx = Math.abs(destX - x);
        int dy = Math.abs(destY - y);

        // A knight moves in an L-shape: 2 squares in one direction and 1 square in a perpendicular direction.
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
