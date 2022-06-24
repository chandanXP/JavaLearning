package com.company.JAVA500;

import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }

        int temp = arr[n-1];
        for(int i = n-1; i > 0; i--){
            //1 2 3 4 5
            //5 1 2 3 4
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int i : arr){
            System.out.println(i);
        }

    }
}
