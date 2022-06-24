package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k =sc.nextInt();

        //int arr[]= new int[N];
        ArrayList arr = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            arr.add(sc.nextInt());
        }
        //1 2 3 4 5
        int L=0, R=k-1;
        for(int i=0; i<N; i= i+k){
            L=i;
            for(int j = i + (k-1); j>L ;j--){
                if(j>N-1){
                    j=N-1;
                }

                int temp =0;
                temp = (int)arr.get(j);
                arr.set(j, arr.get(L));
                arr.set(L, temp);
                L++;
            }

        }

        for(int i=0; i<N; i++){
            System.out.println(arr.get(i));
        }
    }
}
