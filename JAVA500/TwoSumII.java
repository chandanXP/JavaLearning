package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int sum = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<Integer>(2);
        int jtemp=0, itemp=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){

                if(a[i] + a[j] == sum){
                    res.add(i);
                    res.add(j);
                    break;
                }

            }
        }

        System.out.println(res);
    }
}
