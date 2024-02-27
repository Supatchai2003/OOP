package boardgame;

public class Rook extends Figure {

    public Rook(String name,boolean color, int x, int y) {
        super(name,color, x, y);
    }

    @Override
    public boolean freeMove(ChessBoard board, int destX, int destY) {
        // ตรวจสอบว่าเดินแนวตั้งหรือแนวนอน
        if (destX == x || destY == y) {
            // ตรวจสอบว่าช่องว่าง
            if (board.getFigure(destX, destY) == null) {
                return true;
            }
        }
        return false;
    }
}