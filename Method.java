package com.company;

public class Method {
    static int sum(int a , int b){
        int c =a+b;
        return c;
    }
    public static void main(String[] args) {
        int val = sum(5,10);
        System.out.println(val);

        Method obj = new Method();
        int obj_value = obj.sum(2, 9);
    }
}
