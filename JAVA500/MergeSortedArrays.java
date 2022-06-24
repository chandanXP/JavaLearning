package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []arr1 = new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int []arr2 = new int[m];
        for(int i =0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        for(int j =0; j<arr2.length; j++){
            int temp = -1;
            for(int i = 0; i<arr1.length; i++){
                if(arr1[i]>arr2[j]){
                    temp = arr1[(n-1) - j];
                    arr1[(n-1) - j] = arr2[j];
                    arr2[j] = temp;
                    break;

                }
            }
            if(temp==-1){
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i =0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        for(int i =0, j=0; i< arr2.length; i++, j++){
            System.out.println(arr2[i]);
        }

    }

}
