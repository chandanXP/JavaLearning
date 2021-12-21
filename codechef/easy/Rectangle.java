package com.company.codechef.easy;
import  java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d =sc.nextInt();
            if( ( (a==c) && (b==d) ) || ( (a==d && b==c) ) || ( (a==b) && (c==d) ) ){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            --t;
        }
    }
}
