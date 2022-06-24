package com.company.Recursion;

public class ReverseNum {
    static int sum=0;
    static void reverse_num(int n){
        if(n==0){
            return ;
        }
        int rem  = n%10;
        sum = sum*10 +rem;
        reverse_num(n/10);
    }
    public static void main(String[] args) {
        reverse_num(54321);
        System.out.println(sum);
    }

}
