package com.company.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnWithoutArguments {
    public static void main(String[] args) {
        int a[] = {1, 44,2 ,3,4,33, 44 ,100, 0,44, 10};
        ArrayList<Integer> l = all_index(a,0,44);
        System.out.println(l);
    }
    static ArrayList<Integer> all_index(int a[], int i , int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(i>a.length-1){
            return list;
        }
        else if(a[i] ==target){
            list.add(i);
        }

        ArrayList<Integer> taking_list_from_Below_calls = all_index(a, i+1, target);
        list.addAll(taking_list_from_Below_calls);

        return list;
    }
}
