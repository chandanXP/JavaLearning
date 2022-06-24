package com.company.codechef.easy;

import java.util.Scanner;

public class SayNoToDrug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            int players[]  = new int[N];
            for(int i=0; i<N; i++)
                players[i] = sc.nextInt();

            //dopeSpeed  = speed + K*(L-1)
            int dopeSpeed=players[N-1] + K*(L-1);
            players[N-1] = dopeSpeed;//injecting
            System.out.println(players[N-1]);
            boolean res= true;
            for(int i=0; i<N-1; i++){
                if(players[i]>=players[N-1]){
                    System.out.println("greater");
                    res= false;
                    break;
                }
            }

            if(res) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
