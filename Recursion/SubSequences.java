package com.company.Recursion;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        sub_seq("", "abc");

        ArrayList<String> l = sub_seq_array("", "abc");
        System.out.println(l);
    }
    static  void sub_seq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub_seq(p + ch, up.substring(1));
        sub_seq(p, up.substring(1));
    }

    static ArrayList<String> sub_seq_array(String p, String up){
        if(up.isEmpty()){
            //p is string and function's return type is: arraylist,
            //so we ahve to convert the string into arraylist and return the list
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //list coming from child functions.
        ArrayList<String> left = sub_seq_array(p +ch, up.substring(1));
        ArrayList<String> right = sub_seq_array(p, up.substring(1));

        left.addAll(right);//combining list and return list
        return left;
    }
}
