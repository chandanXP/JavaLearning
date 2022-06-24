package com.company.Recursion;

public class NNumbers {
    public static void main(String[] args) {
        int num =10;
        n(num);
    }
    static  void n(int num){
        if(num<0){
            return;
        }
        else{
            n(num-1);
            System.out.println(num);
        }
    }


}
