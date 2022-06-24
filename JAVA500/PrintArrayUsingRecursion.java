package com.company.JAVA500;

import java.util.Scanner;

public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]= new int[N];
        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        DisplayEle(N , arr);

    }
    public static void DisplayEle(int size, int arr[]){
        if(size == 0){
            System.out.println(arr[size]);
            return;
        }
        DisplayEle(size-1, arr);
        System.out.println(arr[size-1]);
        return;
    }
}
