package com.company.JAVA500;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result= find_power(x,n);
        System.out.println(result);
    }
    public static int find_power(int x, int n){

        if(n==1){
            return x;
        }

        int prdt = find_power( x,n-1);
        prdt = prdt*x;
        return  prdt;
    }
}
