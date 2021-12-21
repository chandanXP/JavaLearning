package com.company.codechef.easy;
import java.util.Scanner;
public class SteelGrade {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int hardness= sc.nextInt();
            float carbon = sc.nextFloat();
            int strength=sc.nextInt();
            if(hardness>50 && carbon<.7f &&  strength>5600){
                System.out.println(10);
            }
            else if(hardness>50 && carbon<.7f && strength<5600){
                System.out.println(9);
            }
            else if(hardness<50 && carbon<.7f && strength>5600){
                System.out.println(8);
            }
            else if(hardness>50 && carbon>.7f && strength>5600){
                System.out.println(7);
            }
            else if(hardness>50 || carbon<.7f || strength>5600){
                System.out.println(6);
            }
            else{
                System.out.println(5);
            }
            --t;
        }
    }
}
