package com.company.Backtracking;

public class AllPathMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true ,true,},
                {true, true ,true,},
                {true, true ,true,}
        };

        all_path_maze("", maze,0, 0);
    }
    static void all_path_maze(String p, boolean [][]maze, int r, int c){
        if(r== maze.length-1 &&  c== maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] =false;//considering this block in my path
        if(r< maze.length-1){
            all_path_maze(p+"D", maze, r+1, c);
        }
        if(c< maze[0].length -1 ){
            all_path_maze(p+"R", maze, r, c+1);
        }
        if(r>0){
            all_path_maze(p+"U", maze, r-1, c);
        }
        if(c>0){
            all_path_maze(p+"L", maze, r, c-1);
        }
        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that made by the functions
        maze[r][c] = true;
        //Note : Make a change, revert the change
    }
}
