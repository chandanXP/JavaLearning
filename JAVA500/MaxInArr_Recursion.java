package com.company.JAVA500;

import java.util.Scanner;

public class MaxInArr_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]= new int[N];
        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int result = find_max(N, arr);
        System.out.println(result);

    }
    public static int find_max(int size, int arr[]){
        if(size==0){
            return arr[0];
        }
        int Max= find_max(size-1, arr);
        if(Max< arr[size-1]){
            Max = arr[size-1];
        }

        return  Max;
    }
}
