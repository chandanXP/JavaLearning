package com.company.Backtracking;
public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board = new boolean[n][n];

        int ways= n_queen(board, 0);
        System.out.println(ways);

    }
    static int n_queen(boolean [][]board , int r){
        if(r== board.length){
            display(board);
            return 1;
        }
        //placing the queen and checking for every row and col
        int count=0;
        for(int c=0; c<board.length; c++){
            if(isSafe(board, r, c)){
                board[r][c] = true;
                count+= n_queen(board, r+1);
                board[r][c] = false;
            }

        }
        //if the entire column is unoccupied the return , no need to print the board

        return  count;

    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //check vertical row
        for(int i=r; i>=0; i--){
            if(board[i][c]){
                return false;//not safe
            }
        }

        //check diagonally left
        int maxleft = Math.min(r,c);
        for(int i =1; i<=maxleft; i++){
            if(board[r-i][c-i]){
                return false;//not safe
            }
        }

        //check diagonally right
        int maxright = Math.min(r, board.length-c-1);
        for(int i =1; i<=maxright; i++){
            if(board[r-i][c+i]){
                return false;//not safe
            }
        }
        return true;//safe
    }

    private static void display(boolean board[][]){
        for(boolean[] row: board){
            for(boolean ele: row){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
