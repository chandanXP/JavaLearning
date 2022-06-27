package com.company.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    static boolean solve(int [][]board){
        int n = board.length;
        int r =-1;
        int c =-1;
        boolean emptyLeft = true;
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0){
                    r = i;
                    c= j;
                    emptyLeft = false;
                    break;
                }
            }
            //if empty element then break
            if(emptyLeft ==false){
                break;
            }
        }

        if(emptyLeft == true){
            return true;
            //sudoku is solved
        }

        for(int number =1 ; number <=9; number++){
            if(isSafe(board, r,c, number)){
                board[r][c] = number;
                if(solve(board)){
                    //found the answer
                    return  true;
                }
                else{
                    board[r][c] = 0;
                }
            }

        }

        return false;
    }

    private static void display(int[][] board) {
        for(int []row: board){
            for(int num: row) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    static  boolean isSafe(int [][]board, int r, int c, int num){
        //check row
        for(int i=0; i< board.length; i++){
            if(board[r][i] == num){
                return  false;
            }
        }
        // check col
        for(int []nums: board){
            if(nums[c] == num){
                return  false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int row_start = r - r % sqrt;
        int col_start = c- c % sqrt;

        for(int i=row_start; i< row_start + sqrt; i++){
            for(int j=col_start; j<col_start+sqrt; j++){
                if(board[i][j] ==num){
                    return false;
                }
            }
        }
        return true;
    }


}
