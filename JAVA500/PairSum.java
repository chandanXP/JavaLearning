package com.company.JAVA500;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count =0;
        //1 2 3 4 5 6 7 : K = 7
        for(int i=0; i<n; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] + a[j] == k){
                    count = count + 1;
                }
            }
        }
        if(count>=1){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }
}
