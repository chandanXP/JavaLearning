package com.company.codechef.easy;

import java.awt.*;
import java.util.Scanner;

public class TrappingWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int j=0, k=0, t_sum=0, curr_sum=0, len=0, discrete_sum=0, neg_sum=0, pos_blocks=0, neg_blocks=0;
        for(int i=0; i<n ;i++){
            if(i==0){
                continue;
            }
            else if(a[i]>0){
                // 8 0 0 2 0 0 4
                // 0 1 2 3 4 5 6
                len = i-j;
                if(len<=1){
                    curr_sum = curr_sum +0;
                }
                else if(a[i]>= a[j]){
                    curr_sum = Math.min(a[j], a[i]) * (len-1);
                    t_sum = t_sum +curr_sum;
                    neg_sum=0;
                    j=i;
                    k=j;
                }
                else if(a[i]< a[k]){

                    neg_sum = neg_sum + Math.min(a[i], a[k]) * ((i-k) -1);
                    neg_blocks = neg_blocks + a[i];
                    k=i;
                }
                else if(a[i] > a[k]){
                    neg_sum  = Math.min(a[i], a[j]) * (len-1);
                    k=i;
                    j=k;
                }
            }
        }
        System.out.println(t_sum);
        System.out.println(neg_blocks);
        System.out.println(neg_sum);
    }
}

//sum =0
//sum < next sum;
//sum > next sum
//ai > aj tsum+ next sum
//ai < aj find next sum and continue and i++, if ai+1 and aj+1 decreases k=i then prev next sum addin in tsum j=k
