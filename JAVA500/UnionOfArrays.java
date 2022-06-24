package com.company.JAVA500;

import java.util.*;

public class UnionOfArrays {
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

        Set<Integer> set = new HashSet<Integer>();
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            set.add(i);
        }

        List L = new ArrayList();
        L.addAll(set);


    }
}
