package com.company.codechef.easy;
import java.util.Scanner;
public class Kitchen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int size = sc.nextInt();
            int []arr= new int[size];
            int []arrB = new int[size];
            int counter = 0;
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
                if(i>0){
                    arr[i] = arr[i-1] - arr[i];//1 9 5
                }

            }
            for(int i=0; i<size; i++){
                arrB[i] = sc.nextInt();
                if(arr[i]>=arrB[i]){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
