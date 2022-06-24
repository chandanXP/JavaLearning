package com.company.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int N = fact(5);
        System.out.println(N);
    }
    static  int fact(int num){
        if(num<=1){
            return num;
        }
        return num * fact(num-1);
    }

}
