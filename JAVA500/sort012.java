package com.company.JAVA500;

import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }
        int k=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    k= arr[i];
                    arr[i]= arr[j];
                    arr[j] =k;

                }
            }

        }
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
