package com.company.codechef.easy;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int size = sc.nextInt();
            int []arr = new int[size];

            for(int i=0; i<size;++i)
                arr[i]= sc.nextInt();

            Arrays.sort(arr);
            int min_sum = arr[0];
            if(size == 1){
                System.out.println(0);
            }
            else{
                System.out.println(min_sum*(arr.length-1));
            }
        }
    }
}
