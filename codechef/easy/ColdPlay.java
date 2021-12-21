package com.company.codechef.easy;
import  java.util.Scanner;

public class ColdPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int distance =sc.nextInt();
            int duration = sc.nextInt();
            System.out.println(distance/duration);
            --t;
        }
    }
}
