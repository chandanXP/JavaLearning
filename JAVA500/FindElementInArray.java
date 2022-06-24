package com.company.JAVA500;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]= new int[N];
        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int find_n = sc.nextInt();

        find_ele(find_n , N, arr);


    }
    public static void find_ele(int ele, int n, int arr[]){
        if(n==0){
            return;
        }
        find_ele(ele, n-1 , arr);

        if(arr[n-1]== ele){
            System.out.println(n-1);
            return;
        }



    }
}
