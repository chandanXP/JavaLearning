package com.company.codechef.easy;
import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0){
            int bSal =sc.nextInt();
            double da, hra, gSal;
            if(bSal<1500){
                da =  bSal* 0.90f;
                hra = bSal*0.10f;
            }
            else{
                da = bSal*0.98f;
                hra = 500;
            }
            gSal = da+hra+bSal;
            System.out.printf("%.2f\n",gSal);
            --t;
        }

    }
}
