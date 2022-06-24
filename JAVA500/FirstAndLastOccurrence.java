package com.company.JAVA500;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int first=-1, last=-1;
        for(int i=0; i<n; i++){
            //1 3 5 5 5 5 67 123 125
            if(a[i] == x){
                if(first<0){
                    first =i;
                    last=i;
                }
                last = i;
            }

        }
        ArrayList<Long> L = new ArrayList<>();
        System.out.println( first +" "+last);
    }
}
