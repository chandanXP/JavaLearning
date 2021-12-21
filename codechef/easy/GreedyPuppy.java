package com.company.codechef.easy;
import java.util.Scanner;
public class GreedyPuppy {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            int coin=0;
            for(int i=1; i<=k;++i){
                coin = Math.max(coin,n%i);
            }
            System.out.println(coin);
            --t;
        }
    }
}
