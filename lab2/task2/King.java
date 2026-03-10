package lab2.task2;

public class King extends Piece {

    public King(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        if(Math.abs(a.row - b.row) <= 1 &&
           Math.abs(a.col - b.col) <= 1){
            return true;
        }

        return false;
    }

}
