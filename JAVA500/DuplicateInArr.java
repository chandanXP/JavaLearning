package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateInArr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int x=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                x= nums[i];
            }
        }
        System.out.println(x);
    }
}
