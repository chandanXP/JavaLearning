package com.company.codechef.easy;
import java.util.Scanner;
public class MutateMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int num = sc.nextInt();
            int []arr= new int[size];
            int count = 0;
            for(int i=0; i<arr.length; ++i){
                arr[i] = sc.nextInt();
                arr[i] = arr[i+num];
                if(arr[i]%7==0)
                    ++count;
            }
            System.out.println(count);
        }
    }
}
