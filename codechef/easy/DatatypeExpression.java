package com.company.codechef.easy;

public class DatatypeExpression {
    public static void main(String[] args) {
        byte x =5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f +x;
        System.out.println(b +" "+a);

        int num  =100;
        System.out.println(num++);
        System.out.println(++num);

        int numy = 7;
        int xnum = ++numy *8;
        System.out.println(xnum);
        char ch = '2';
        System.out.println(++ch);
    }
}
