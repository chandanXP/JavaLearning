package com.company.JAVA500;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        System.out.println(str);
        str = str.replaceAll("0", "5");
        System.out.println(str);
    }
}
