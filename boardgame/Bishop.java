package boardgame;

public class Bishop extends Figure {
    public Bishop(String name, boolean color, int x, int y) {
        super(name, color, x, y);
    }

    @Override
    public boolean freeMove(ChessBoard board, int destX, int destY) {
      if(Math.abs(destX-x)==Math.abs(destY-y)){
        if(board.getFigure(destX, destY)!=null){
            return false;
        }
          return true;
      }
      return false;
    }
    @Override
    public boolean getColor() {
        return color;
    }
}