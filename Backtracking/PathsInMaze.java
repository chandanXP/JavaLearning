package com.company.Backtracking;

import java.util.ArrayList;


public class PathsInMaze {
    public static void main(String[] args) {
        //ArrayList<String> paths = path("", 3,3);
        //System.out.println(paths);
        //System.out.println(three_path("", 3,3));

        boolean[][] maze = {
                {true, true ,true,},
                {true, false ,true,},
                {true, true ,true,}
        };

        maze_with_obstacle("", maze,0, 0);

    }
    static ArrayList<String> path(String p, int r, int c){
        ArrayList<String> temp = new ArrayList<>();
        if(c==1 && r==1){
            temp.add(p);
            return temp;
        }
        else if(r==1 || c==1){
            if( c>1){
                temp = path(p+"R",r, c-1);
            }
            else if(r>1){
                temp = path(p+"D", r-1, c);
            }

            return temp;
        }

        ArrayList<String> left = path(p+"D", r-1, c);
        ArrayList<String> right = path(p+"R", r, c-1);

        left.addAll(right);
        return  left;

    }

    static ArrayList<String> three_path(String p, int r, int c){

        if(c==1 && r==1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }

        ArrayList<String> temp = new ArrayList<>();
        if(r>1 && c>1) {
            temp.addAll(three_path(p+'D', r-1, c-1));
        }
        if( c>1){
            temp.addAll(three_path(p+'H', r, c-1));
        }
        if(r>1){
            temp.addAll(three_path(p+'V', r-1, c));
        }

        return temp;

    }
    static void maze_with_obstacle(String p, boolean [][]maze, int r, int c){
        if(r== maze.length-1 &&  c== maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            maze_with_obstacle(p+"D", maze, r+1, c);
        }
        if(c< maze[0].length -1 ){
            maze_with_obstacle(p+"R", maze, r, c+1);
        }

    }
}
