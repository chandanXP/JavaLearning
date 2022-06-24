package com.company.JAVA500;

import java.io.*;
import java.util.*;

public class Recursion_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int k = n;
        printIncreasing(n);

    }
    public static  int k =1;
    public static void printIncreasing(int n){
        if(k>n){
            return;
        }
        //n-(n-k)
        System.out.println(n - (n-(k++)));
        printIncreasing(n);

    }

}
