package com.company.codechef.easy;
import java.util.Scanner;
public class CoinsAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int coins = sc.nextInt();
            int count =0;
            int i=1;
            while((i*(i+1))/2<=coins){
                count++;
                i++;
            }
            System.out.println(count);
        }
    }
}
