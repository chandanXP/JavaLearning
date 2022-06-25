package com.company.Recursion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SkipACharacter {
    public static void main(String[] args) {
//        String s = "chandan";
//        s= skip(s);
//        System.out.println(s);

        skip2("", "saroj");
    }
    static String skip(String str){
        String ch = "";//null character
        if(str.isEmpty()){
            return str;
        }
        else if(str.charAt(0) !='a'){
           ch = Character.toString(str.charAt(0)) ;
        }

        return ch + skip(str.substring(1));
    }

    static  void skip2(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip2(p, up.substring(1));
        }
        else{
            skip2(p+ch, up.substring(1));
        }
    }

}
