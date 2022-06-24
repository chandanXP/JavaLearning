package com.company.JAVA500;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a[] = new int[N];


        for(int i=0; i<N;i++){
            a[i]= sc.nextInt();
        }
        int D = sc.nextInt();

        int temp=0;
        for(int i=1; i<=D; i++){
            temp = a[0];
            for(int j=0 ; j<N-1 ;j++){
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }

        for(int i=0; i<N; i++){
            System.out.println(a[i]);
        }

    }
}
