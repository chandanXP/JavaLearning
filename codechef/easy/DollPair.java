package com.company.codechef.easy;
import java.util.Arrays;
import java.util.Scanner;

public class DollPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int size = sc.nextInt();
            int []arr =  new int[size];
            for (int i=0; i<size;++i){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0; i<size;){//first
                int j=i+1;
                if(size==1){
                    System.out.println(arr[0]);
                    break;
                }
                else if(arr[i]!=arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
                else if(j==size-2){
                    System.out.println(arr[size-1]);
                    break;
                }
                i=i+2;
            }
        }
    }
}
