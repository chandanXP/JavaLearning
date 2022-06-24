package com.company.codechef.easy;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        int l = str.length();
        int char_count =0;
        int int_count = 0;
        int space_count = 0;
        char Char[] = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char digit[] = {'0','1','2','3','4','5','6','7','8','9'};

        for(int i =0 ; i<l; i++){
            if(str.charAt(i)=='$'){
                break;
            }
            else if( str.charAt(i) == ' '){
              space_count++;
            }

        }
    }
}
