package com.company.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num = fib(5);
        System.out.println(num);
    }

    static int  fib(int n){
        if(n==0){
            return n;
        }
        else if(n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
