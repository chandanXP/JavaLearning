package com.company.JAVA500;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnionOfArray {
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

        int count  =  0;
        int count1 = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        Set<Integer> set = new HashSet<>();
        for(Integer i : a){
            set.add(i);
        }
        for(Integer i : b){
            set.add(i);
        }

        System.out.println(set.size());
        if(n>m){
            Arrays.sort(b);
            for(int i=0; i<a.length; i++){
                    int found  = Arrays.binarySearch(b , a[i]);
                    if(found<0){
                        count++;
                    }
                    else{
                        count1++;
                    }
            }
        }
        else{
            Arrays.sort(a);
            for(int i=0; i<b.length; i++){
                //1 2 3
                //1 2 3 4 5
                int found  =Arrays.binarySearch(a, b[i]);
                if(found<0){
                    count++;
                }else{
                    count1++;
                }
            }
        }
        System.out.println(count + count1);
    }
}
