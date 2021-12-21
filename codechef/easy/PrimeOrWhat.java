package com.company.codechef.easy;
import java.util.Scanner;

public class PrimeOrWhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int num = sc.nextInt();
            boolean res = true;
            for(int i = 2; i<num; i++){
                if(num%i==0) {
                    res = false;
                    break;
                }
            }
            if(res){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            --t;
        }
    }
}
