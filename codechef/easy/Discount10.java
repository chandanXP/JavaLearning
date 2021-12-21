package com.company.codechef.easy;
import  java.util.Scanner;
public class Discount10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int items = sc.nextInt();
            int price = sc.nextInt();
            float expense = items*price;
            if(items>1000){
                expense =  (expense) - (expense*.1f) ;
            }
            System.out.printf("%.5f",expense);
            --t;
        }
    }
}
