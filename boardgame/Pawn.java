package boardgame;

public class Pawn extends Figure {
    int first = 1;

    public Pawn(String name, boolean color, int x, int y) {
        super(name, color, x, y);
    }

    @Override
    public boolean freeMove(ChessBoard board, int destX, int destY) {
        int deltaX = Math.abs(destX - x);
        int deltaY = Math.abs(destY - y);

        if (color) { // สีขาว
            if (first == 1) {
                if (destX > x && deltaX == 2 && deltaY == 0 || deltaX == 1) { // ตรวจสอบการเคลื่อนที่เริ่มต้น
                    if (board.isFree(destX, destY)) {
                        first++;
                        return true;
                    }
                }
            } else if (deltaX == 1 && deltaY == 0 && destX > x) { // ตรวจสอบการเคลื่อนที่ที่ไม่ใช่การเริ่มต้น
                if (board.isFree(destX, destY)) {
                    if (!board.isFree(deltaX, deltaY)) {
                        return false;
                    }
                    return true;
                }
            }
            // // ในส่วนของการเคลื่อนที่ของ Pawn
            // else if (deltaX == 1 && deltaY == 1) { // ตรวจสอบการกินแนวเฉียง
            //     if (board.isFree(deltaX, deltaY)) {
            //         if (!board.isFree(deltaX, deltaY)) {
            //             return false;
            //         }
            //         return true;
            //     }

            // }
        } else { // สีดำ
            if (first == 1) {
                if (destX < x && deltaX == 2 && deltaY == 0 || deltaX == 1) { // ตรวจสอบการเคลื่อนที่เริ่มต้น
                    if (board.isFree(destX, destY)) {
                        first++;
                        return true;
                    }
                }
            } else if (deltaX == 1 && deltaY == 0 && destX < x) { // ตรวจสอบการเคลื่อนที่ที่ไม่ใช่การเริ่มต้น
                if (board.isFree(destX, destY)) {
                    if (!board.isFree(deltaX, deltaY)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        if (deltaX == 1 && deltaY == 1) { // ตรวจสอบการกินแนวเฉียง
            if (board.isFree(destX, destY)) {
                if (!board.isFree(deltaX, deltaY)) {
                    return true;
                }
                return false;
            }
        }

        return false;

    }
}
