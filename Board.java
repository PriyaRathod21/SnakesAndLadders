package board;

import java.util.HashMap;

import jumper.Jumper;

public class Board {
    public String board[][];
    public int size;
    public HashMap<String, Jumper> jumpers;

    public Board(int size, HashMap<String, Jumper> jumpers){
        this.size = size;
        this.jumpers = jumpers;
        board = new String[size][size];
        int cnt = 1;
        for(int i=size-1;i>=0;i--){  //i==row and j==col and cnt==count
            if(i%2==0){
                for(int j=size-1;j>=0;j--){
                    board[i][j] = String.valueOf(cnt); //Or board[i][j] = cnt + "";
                    cnt++;
                }
            }
            else{
                for(int j=0;j<size;j++){
                    board[i][j] = String.valueOf(cnt);
                    cnt++;
                }
            }
        }
    }

    public void displayBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]  + "\t");
            }
            System.out.println();
        }
    }

    public int getBoardSize(){
        return size;
    }
}
