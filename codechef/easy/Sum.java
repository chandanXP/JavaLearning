package com.company.codechef.easy;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int D = sc.nextInt();
            int n =sc.nextInt();
            int sum=0;
            for(int i=D; i!=0; --i){
                sum = (n*(n+1))/2;
                n = sum;
            }

            System.out.println(sum);
            --t;
        }

    }
}
