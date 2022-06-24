package com.company.JAVA500;

import java.util.Scanner;

public class MinimumJumps {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res=0;
        for(int i=0; i<arr.length;){
            //1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 20 11 12
            if(arr[i]<=0){
                res = -1;
                break;
            }

            res++;
            i = i + arr[i];

            if(i>= (arr.length-1)){
                break;
            }
        }
        System.out.println(res);
    }
}
