package com.company.JAVA500;

import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max_sum=0;
        int curr_sum=0;
        for(int i=0; i<n; i++){
            //1 2 3 4 5
            curr_sum  = curr_sum + arr[i];
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
            if(curr_sum < 0){
                curr_sum = 0;
            }

        }

        if(max_sum ==0){
            Arrays.sort(arr);
            max_sum = arr[n-1];
        }
        Arrays.asList(arr).contains(arr[0]);

        System.out.println(max_sum);
    }
}
