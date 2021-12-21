package com.company;
//importing scanner class
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        System.out.println("TAKING USER'S INPUTS");
        Scanner sc = new Scanner(System.in);//creating Scanner object sc
        System.out.println("Enter first value: ");
        int a = sc.nextInt();//taking input in integer a
        System.out.println("Enter second value ");
        int b = sc.nextInt();//taking input in integer b
        int sum = a+b;
        //boolean res = sc.hasNextInt();//boolean will throw true if it gets int
        System.out.println("The sum of variables: "+sum);

        //String str1 = sc.next();
        //String str1 = sc.nextLine();
        //System.out.println(str1);

    }
}
