package com.company.JAVA500;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K =sc.nextInt();
        int N = sc.nextInt();


        int arr[]= new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int diff  = arr[N-1] - arr[0];
        int small = arr[0] +K;
        int large  = arr[N-1] -K;

        int min, max;
        for(int i=0; i<N-1; i++){
            min = Math.min(small, arr[i+1]-K);//closest will give the minimal diff in sorted array
            max= Math.max(large, arr[i] +K);// distant will give the minimal diff in sorted array
            if(min<0){
                continue;
            }
            diff  = Math.min(diff, max- min);
            System.out.println(diff);

        }

    }
}
