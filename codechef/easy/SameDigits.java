package com.company.codechef.easy;
import java.util.Scanner;
public class SameDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String str = sc.next();
            long i  = str.chars().filter(ch->ch=='1').count();
            long o  = str.chars().filter(ch->ch=='0').count();
            if(o<=1 || i<=1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
