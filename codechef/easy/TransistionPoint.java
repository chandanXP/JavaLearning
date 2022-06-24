package com.company.codechef.easy;

import java.util.*;

public class TransistionPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for(int i=0; i<n;i++){
            a[i]= sc.nextInt();
        }
        int num=-1;
        for(int i=0; i<n; i++){
            System.out.println("run");
            if(a[i]==1){
                num = 1;
                break;
            }

        }

        System.out.println(num);
    }
}
