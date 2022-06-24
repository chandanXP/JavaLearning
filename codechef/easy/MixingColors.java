package com.company.codechef.easy;

import java.util.Scanner;

public class MixingColors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int n  = sc.nextInt();
            int colorArr[] = new int[n];
            for(int i=0; i<n; i++){
                colorArr[i] =sc.nextInt();
            }

            //check unique
            // {1,2,3,4}
            int count =0;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(colorArr[i]==colorArr[j]){
                        colorArr[i] = colorArr[i] + colorArr[j];
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
