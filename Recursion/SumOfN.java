package com.company.Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int N = SumOf(10);
        System.out.println(N);
    }
    static int SumOf(int num){
        if(num==1){
            return num;
        }
        return num+ SumOf(num-1);
    }
}
