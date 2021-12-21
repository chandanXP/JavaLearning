package com.company.codechef.easy;
import java.util.Scanner;
public class ATM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[size];

            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
                if(arr[i]<=k){
                    k= k-arr[i];
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
        }
    }
}
