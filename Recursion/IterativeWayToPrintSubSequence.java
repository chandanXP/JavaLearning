package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class IterativeWayToPrintSubSequence {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);

        for(List<Integer> l : ans){
            System.out.println(l);
        }

    }

    static List<List<Integer>> subset(int []arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i  =0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);//adding internal list to the outer

            }
        }

        return  outer;
    }
}
