package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //int k =sc.nextInt();

        int arr[][]= new int[N][2];
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int a[][] = new int[N][2];
        int t =0;
        int temp =0;
        int over=0;
        for(int i=1; i<N; i++){
            if(arr[i][0] <= arr[i-1][1]){
                if(i==N-1){
                    a[t][0] = arr[temp][0];
                    a[t][1] = arr[i][1];
                }
                over++;
                continue;
            }
            else if(arr[i][0] > arr[i-1][1]){
                if(i==N-1){
                    a[t][0] = arr[temp][0];
                    a[t][1] = arr[temp][1];t++;
                    a[t][0] = arr[i][0];
                    a[t][1] = arr[i][1];
                }
                else{
                    a[t][0] = arr[temp][0];
                    a[t][1] =arr[i-1][1];
                    t++;
                    temp = i;
                }
            }
        }
        int beg =0;
        int end = over-1;
        int[][] sub = new int[end - beg + 1][2];
        System.arraycopy(a, beg, sub,0, sub.length);
        for(int i=0; i<sub.length; i++){
            System.out.println(sub[i][0] +" "+ sub[i][1]);
        }
    }
}
//[[i,j]
// [1,3], temp
// [2,6], i
// [8,10],  temp
// [7,18]] i
