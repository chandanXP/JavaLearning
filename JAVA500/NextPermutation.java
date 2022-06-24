package com.company.JAVA500;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int temp=0;
        int idx_i =0;
        for(int i=a.length-2; i>=0; i-- ) {//break point
            //1 5 8 4 7 6 5 3 1
            if ((a[i] < a[i + 1])) {
                idx_i = i;
                break;
            }
        }
        int closest = Integer.MAX_VALUE;
        int idx_j = 0;
        for(int j=idx_i+1; j<a.length-1; j++){//closest
            if(a[idx_i] < a[j]){
                if(a[j] < closest){
                    closest = a[j];
                    idx_j = j;
                }
            }
        }
        //swap
        temp = a[idx_i];
        a[idx_i] = closest;
        a[idx_j] = temp;

        //reverse
        int r = 0;
        for(int j=idx_i+1; j<a.length-1; j++){
            if(j < (a.length-1)-r){
                temp = a[j];
                a[j] = a[(a.length-1)-r];
                a[(a.length-1)-r] = temp;
                r++;
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
