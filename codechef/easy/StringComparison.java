package com.company.codechef.easy;
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0){
            String str1 = sc.next();
            String str2 =sc.next();
            int x=0, read_same=0, read_diff=0;
            for(int i =0; i<str1.length(); ++i){
                if(str1.charAt(i)=='?' || str2.charAt(i)=='?'){
                    ++x;
                }
                else if(str1.charAt(i) == str2.charAt(i)){
                    ++read_same;
                }
                else{
                    ++read_diff;
                }
            }
            System.out.println( str1.length() - (x+read_same) +" "+ (x+read_diff) );
            --t;
        }
    }
}
