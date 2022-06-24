package com.company.JAVA500;

import java.util.Arrays;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a[] =new int[N];
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int num=-1;
        int count= 0;
        for(int i=0; i<N;i++){
            if(i==0){
                if(N==1){
                    num=a[i];
                }

                count ++;
                continue;
            }

            if(a[i] != a[i-1]){
                count=0;
            }

            count++;

            if(count > (N/2)){
                System.out.println(a[i]);
                break;
            }


        }
    }
}
