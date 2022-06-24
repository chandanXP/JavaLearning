package com.company.JAVA500;

import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();

        long n = N;
        long a[] = new long[(int)n];
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        long left=0;
        long rt = 0;
        long pos=0;
        for(int i=0; i<N; i++){
            if(i==0){
                if(a.length ==1){
                    pos = 1;
                    break;
                }
                left=a[i];
                rt = a[(N-1)-i];

            }
            if(i>=(N-1)-i){
                if(i == (N-1)-i){
                    pos =i+1;
                }
                else{
                    pos =-1;
                }
                break;
            }
            //5 4 3 2 1
            //1 2 3 4 5
            if(left>rt){
                rt = rt + a[(N-1) - i - 1];
            }
            else if(rt> left){
                left = left + a[i +1];
            }
            else if( rt == left){
                rt = rt + a[(N-1) - i - 1];
                left = left + a[i +1];
            }


        }
        System.out.println(pos);
    }
}
