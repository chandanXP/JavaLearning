package com.company.Backtracking;

import java.util.Arrays;

public class AllPathPrint {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true ,true,},
                {true, true ,true,},
                {true, true ,true,}
        };
        int path [][] = new int[maze.length][maze[0].length];

        all_path_print("", maze,0, 0, path, 1);
    }
    static void all_path_print(String p, boolean [][]maze, int r, int c, int path[][],int step){
        if(r== maze.length-1 &&  c== maze[0].length-1 ){
            path[r][c] = step;
            for(int []a : path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            path[r][c] =0;
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] =false;//considering this block in my path
        path[r][c] = step;
        if(r< maze.length-1){
            all_path_print(p+"D", maze, r+1, c, path ,step+1);
        }
        if(c< maze[0].length -1 ){
            all_path_print(p+"R", maze, r, c+1, path ,step+1);
        }
        if(r>0){
            all_path_print(p+"U", maze, r-1, c, path ,step+1);
        }
        if(c>0){
            all_path_print(p+"L", maze, r, c-1, path ,step+1);
        }
        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that made by the functions
        maze[r][c] = true;
        path[r][c] = 0;
        //Note : Make a change, revert the change
    }
}
