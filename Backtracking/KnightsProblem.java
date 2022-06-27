package com.company.Backtracking;



public class KnightsProblem {
    public static void main(String[] args) {
        int n =4;
        boolean [][] board = new boolean[n][n];
        knights(board, 0, 0, n);


    }

    static void knights(boolean[][]board , int r, int c , int knights){
        if(knights==0){//no knights
            display(board);
            System.out.println();
            return;
        }
        if(r == board.length-1 && c== board.length){
            return;//at last position
        }
        if(c==board.length){//if all cols are traversed then jump to next row
            knights(board, r+1, 0, knights);
            return;
        }
        if(isSafe(board, r,c)){//if safe
            board[r][c] = true;
            knights(board,r , c+1, knights-1);
            board[r][c] = false;
        }

        knights(board, r, c+1, knights);///if not safe


    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board, r-1, c+2)){
            if(board[r-1][c+2]){
                return  false;
            }
        }
        if(isValid(board, r-1, c-2)){
            if(board[r-1][c-2]){
                return  false;
            }
        }
        if(isValid(board, r-2, c+1)){
            if(board[r-2][c+1]){
                return  false;
            }
        }
        if(isValid(board, r-2, c-1)){
            if(board[r-2][c-1]){
                return  false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean [][]board, int r, int c) {
        if(r< board.length && r>= 0&& c< board.length && c>=0){
            return  true;
        }

        return false;
    }


    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean ele: row) {
                if (ele) {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
