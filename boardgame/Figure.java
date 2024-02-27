package boardgame;
public abstract class Figure {
    protected String name;
    protected boolean color;
    protected int x; // row
    protected int y; // col
    

    public Figure(String name, boolean color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract boolean freeMove(ChessBoard board, int destX, int destY);
   
   public boolean getColor(){
    return color;
   }
   
    public String getName(){
        return name;
    }
}
   