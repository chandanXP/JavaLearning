package com.company.JAVA500;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];

        for(int i=0; i<N;i++){
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);

        for(int i=0; i<N ;i++){
            System.out.println(a[i]);
        }
    }
}
