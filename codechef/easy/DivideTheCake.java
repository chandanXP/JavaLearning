package com.company.codechef.easy;

import java.util.Scanner;

public class DivideTheCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();

            if(360%n==0) {
                System.out.println("y");
            }
            else {
                System.out.println("n");
            }


            if(n<=360)
                System.out.println("y");
            else
                System.out.println("n");


            int diff = n*(n+1)/2;
            if( diff<=360)
                System.out.println("y");
            else
                System.out.println("n");
        }
    }
}
