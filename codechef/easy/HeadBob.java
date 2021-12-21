package com.company.codechef.easy;
import java.util.Scanner;

public class HeadBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String ges = sc.next();
            if(ges.contains("Y"))
                System.out.println("NOT INDIAN");
            else if(ges.contains("I"))
                System.out.println("INDIAN");
            else if(ges.contains("I") && ges.contains("Y"))
                System.out.println("NOT SURE");
            else
                System.out.println("NOT SURE");
            --t;
        }
    }
}
