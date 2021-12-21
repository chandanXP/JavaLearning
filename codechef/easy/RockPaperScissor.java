package com.company.codechef.easy;
import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("1 for rock\n2 for paper\n3 for scissor");
        System.out.println("Enter your response:");
        int value = (int)(Math.random()*(3-1+1)+1);//range [1,3]

        Scanner sc = new Scanner(System.in);
        int  res = sc.nextInt();
        if (res == value){
            System.out.println("Draw because of same choice!");
        }
        else if(res ==1 && value ==3){
            System.out.println("You win!");
        }
        else if(res>value){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
