package com.company.codechef.easy;

import java.util.Scanner;

public class MaxCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            double n_circle = sc.nextDouble();
            double rest_circle=Double.MAX_VALUE;
            int count=0;
            while(rest_circle>0){
                double sqr = Math.floor(Math.sqrt(n_circle));
                count++;
                rest_circle = n_circle - sqr*sqr;
                n_circle = rest_circle;
            }
            System.out.println(count);
        }
    }

}
