package com.company.JAVA500;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
         int a[] = new int[n];
         for(int i=0; i<n; i++){
             a[i] = sc.nextInt();
         }

         int temp =0;
         for(int i=1; i<n ; i= i+2){
             temp = a[i-1];
             a[i-1] = a[i];
             a[i] =temp;
         }
         for(int i=0; i<n; i++){
             System.out.println(a[i]);
         }

    }
}
