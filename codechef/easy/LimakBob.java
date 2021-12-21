package com.company.codechef.easy;
import java.util.Scanner;

public class LimakBob {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int LMax = sc.nextInt();
            int BMax = sc.nextInt();
            int l=1;
            while (true){
                int b=l+1;
                if(l>LMax){
                    System.out.println("Bob");
                    break;
                }
                if (b>BMax){
                    System.out.println("Limak");
                    break;
                }
                l=l+2;
            }
        }
    }
}
