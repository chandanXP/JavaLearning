package com.company.codechef.easy;
import java.util.Scanner;
public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n =sc.nextInt();
            int sum =0;
            for(int i=n; i>=1; i=i-2){
                sum = sum +(i*i);
            }
            System.out.println(sum);
        }
    }
}
