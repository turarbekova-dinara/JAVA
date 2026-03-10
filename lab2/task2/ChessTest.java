package lab2.task2;

public class ChessTest {

    public static void main(String[] args){

        Position start = new Position(1,1);
        Position end = new Position(1,8);

        Rook rook = new Rook(start);

        System.out.println(rook.isLegalMove(end));

    }

}
