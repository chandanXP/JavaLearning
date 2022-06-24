package com.company.JAVA500;

import java.io.*;
import java.util.*;

public class Recursion_3 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pid(n);
    }
    public static int K = 1;
    public static void pid(int n){
        if(n>0){
            System.out.println(n);
            pid(n-1);
            System.out.println(n);
        }
    }
}
