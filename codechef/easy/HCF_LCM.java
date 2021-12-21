package com.company.codechef.easy;
import java.util.Scanner;

public class HCF_LCM {
    static void hcf(int a,int b){
        int low =  Math.min(a,b);
        int hfactor=1;
        if(a==b){
            hfactor = b;
        }
        else if(a==1 || b==1){
            hfactor = Math.min(a,b);
        }
        for(int j =2 ; j<=low; ++j){
            if(a%j==0 && b%j==0){
                hfactor = j;
            }
        }
        System.out.println(hfactor);
    }
    static void lcm(int numOne , int numTwo){
        int mp = Math.max(numOne,numTwo);
        while(true)
        {
            if((mp%numOne == 0) && (mp%numTwo == 0))
                break;
            else
                mp++;
        }
        System.out.println(mp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            hcf(x,y);
            lcm(x,y);
            --t;
        }
    }
}
