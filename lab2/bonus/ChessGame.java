package lab2.bonus;

import lab2.task2.Position;
import lab2.task2.Rook;

public class ChessGame {
    public static void main(String[] args){

        Board board = new Board();

        Rook rook = new Rook(new Position(0,0));

        board.placePiece(rook,0,0);

        board.drawBoard();

        board.move(0,0,0,5);

        System.out.println();

        board.drawBoard();

    }
}
