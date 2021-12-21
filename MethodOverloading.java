package com.company;

public class MethodOverloading {
    static void tell_joke(){
        System.out.println("I invented a new word\n"+"Plagiarism");
    }
    static void change(int []arr){
        arr[0]= 90;
    }
    static void multiply(){
        System.out.println("please pass at least 2 numbers to multiply");
    }
    static void multiply(int a ,int b){
        int c =a*b;
        System.out.println(c);
    }
    static void multiply(int a , int b, int c){
        int d = a*b*c;
        System.out.println(d);
    }
    public static void main(String[] args) {
        //tell_joke();
        /*
        int []age={34,55,76,12,9};
        change(age);//first value of array will be changed as in case of array we passed reference of the array
        System.out.println(age[0]);
        */

        //Method Overloading
        multiply();
        multiply(10, 4);
        multiply(12, 3, 72);

    }
}
