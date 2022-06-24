package com.company.JAVA500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int []a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        List<List<Integer>> list  = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            for(int j= i+1 ; j<a.length; j++){
                for(int k = j+1; k<a.length; k++){
                    if(a[i] + a[j] + a[k] == 0){
//                        list2.add(a[i]);
//                        list2.add(a[j]);
//                        list2.add(a[k]);
//                        list.add(list2);
//                        list2.removeAll(list2);
                        List<Integer> source = Arrays.asList(a[i], a[j], a[k]);
                        list.add(source);
                    }
                }
            }
        }
        System.out.println(list);
//        for (List<Integer> listn : list) {
//            System.out.print("  [");
//
//            for (Integer item : listn) {
//                System.out.print("  "
//                        + item
//                        + ", ");
//            }
//            System.out.println("], ");
//        }
//        System.out.println("]");

    }
}
