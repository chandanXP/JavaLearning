package com.company.codechef.easy;
import java.util.Scanner;

public class PeriVsArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double area = l*b, peri= 2*(l+b);
            if(area == peri){
                System.out.println("eq");
                System.out.println(area);
            }
            else if(area>peri){
                System.out.println("area");
                System.out.println(area);
            }
            else{
                System.out.println("peri");
                System.out.println(peri);
            }
        }
    }
}
