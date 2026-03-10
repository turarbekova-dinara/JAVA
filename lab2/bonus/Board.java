package lab2.bonus;

import lab2.task2.Piece;
import lab2.task2.Position;

public class Board {

    Piece[][] board;

    public Board(){
        board = new Piece[8][8];
    }

    public void placePiece(Piece p, int row, int col){
        board[row][col] = p;
    }

    public boolean move(int r1,int c1,int r2,int c2){

        Piece p = board[r1][c1];

        if(p == null){
            return false;
        }

        Position target = new Position(r2,c2);

        if(p.isLegalMove(target)){
            board[r2][c2] = p;
            board[r1][c1] = null;
            return true;
        }

        return false;
    }

    public void drawBoard(){

        for(int i=0;i<8;i++){

            for(int j=0;j<8;j++){

                if(board[i][j] == null){
                    System.out.print(". ");
                }else{
                    System.out.print("P ");
                }

            }

            System.out.println();
        }
    }

}