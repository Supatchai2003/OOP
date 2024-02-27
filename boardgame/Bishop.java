package boardgame;

public class Bishop extends Figure {
    public Bishop(String name ,boolean color, int x, int y) {
        super(name, color, x, y);
    }

    @Override
    public boolean freeMove(ChessBoard board, int destX, int destY) {
        // ตรวจสอบว่าตำแหน่งปลายทางอยู่ในเส้นทแยงมุมของ Bishop หรือไม่
        // หากอยู่ในเส้นทแยงมุม และไม่มี Figure อื่นบนเส้นทาง ให้ return true
        // หากไม่อยู่ในเส้นทแยงมุม หรือมี Figure อื่นบนเส้นทาง ให้ return false
        if (Math.abs(destX - x) == Math.abs(destY - y)) {
            int stepX = (destX - x) > 0 ? 1 : -1;
            int stepY = (destY - y) > 0 ? 1 : -1;
            int currentX = x + stepX;
            int currentY = y + stepY;

            while (currentX != destX && currentY != destY) {
                if (board.getFigure(currentX, currentY) != null) {
                    return false;
                }
                currentX += stepX;
                currentY += stepY;
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean getColor(){
        return color;
    }
}
