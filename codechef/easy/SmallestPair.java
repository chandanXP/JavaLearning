package com.company.codechef.easy;
import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0){
            int size = sc.nextInt();
            int []arr = new int[size];
            for(int i=0; i<size;++i){
                int value = sc.nextInt();
                arr[i] = value;
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;++i ){
                for(int j = 0; j<arr.length; ++j){
                    if( j==i || (arr[i]+arr[j])>(min) ) {
                        continue;
                    }
                    min = arr[i]+arr[j];
                }
            }
            System.out.println(min);
            --t;
        }
    }
}
