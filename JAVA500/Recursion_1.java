package com.company.JAVA500;

import java.io.*;
import java.util.*;

public class Recursion_1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n--);
            printDecreasing(n);
        }

    }

}
