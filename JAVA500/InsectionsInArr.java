package com.company.JAVA500;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InsectionsInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int t : a){
            set.add(t);
        }
        for(int t : b){
            set1.add(t);
        }

        set1.retainAll(set);

        System.out.println(set1.size());

    }
}
