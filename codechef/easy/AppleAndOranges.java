package com.company.codechef.easy;
import java.util.Scanner;
public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int k= sc.nextInt();
            int min=0;
            if(a==b) {
                System.out.println(0);
            }
            else {
                min = (a < b) ? b - (a + k) : a - (b + k);
                System.out.println(min);
            }
            --t;
        }
    }
}
