package com.company.codechef.easy;
import java.util.Scanner;
public class BlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int num = sc.nextInt();
            int real_num =num;
            int temp_num=0, rem;
            while(num!=0){
                rem =num%10;
                temp_num = (temp_num*10) + rem;
                num = num/10;
            }
            if(real_num==temp_num){
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
            t--;
        }

    }
}
