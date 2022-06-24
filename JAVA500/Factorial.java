package com.company.JAVA500;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result  = factorial(num);
        System.out.println(result);

    }

    public static int factorial(int n){
        if(n==1){
            return n;//ending condition
        }

        int N = factorial(n-1);
        int fact = N*n;
        return fact;
    }
}
