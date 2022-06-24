package com.company.codechef.easy;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for( int i=2; i<=N; i++){
            if(i==2){
                System.out.println(i);
            }


            for(int j=2; j<i; j++){
                if(i%j==0){
                    break;
                }
                if(j ==i-1){
                    System.out.println(i);
                }
            }
        }
    }
}
