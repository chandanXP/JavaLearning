package com.company.codechef.easy;
import java.util.Scanner;

public class Ndigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        if(count==0 ||count==1){
            System.out.println(1);
        }
        else if(count==2){
            System.out.println(2);
        }
        else if(count==3){
            System.out.println(3);
        }
        else{
            System.out.println("Greater than 3");
        }
    }
}
