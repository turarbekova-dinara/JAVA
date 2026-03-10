package lab2.task2;

public class Knight extends Piece {

    public Knight(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        int dr = Math.abs(a.row - b.row);
        int dc = Math.abs(a.col - b.col);

        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }

}
