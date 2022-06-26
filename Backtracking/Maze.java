package com.company.Backtracking;

public class Maze {
    public static void main(String[] args) {
        int n = count(3,3);
        System.out.println(n);
    }
    static int count(int r ,int c){
        if(c==1 || r==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+ right;
    }

}
