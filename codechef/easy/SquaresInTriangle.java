package com.company.codechef.easy;
import java.util.Scanner;

public class SquaresInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            int x=sc.nextInt();
            int count=0;
            if(x<4){
                System.out.println(0);
                return;
            }
            else if(x%2!=0){
                x=x-1;
            }
            for(int i =x;i>=4;i=i-2){
                ++count;
            }
            int sqr = (count*(count +1))/2;
            System.out.println(sqr);
            --t;
        }
    }
}
