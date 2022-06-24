package com.company.Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int N = sod(12345);
        System.out.println(N);
    }
    static int sod(int num){
        if(num<10){
            return num;
        }
        return num%10 + sod(num/10);

    }


}
