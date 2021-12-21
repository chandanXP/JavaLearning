package com.company.codechef.easy;
import java.util.Scanner;
public class PaintBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=0,b=0;
            String str =sc.next();
            for(int i =0; i<str.length(); ++i){
                if(str.charAt(i)=='a'){
                    ++a;
                }
                else if(str.charAt(i)=='b'){
                    ++b;
                }
            }
            System.out.println(Math.min(a,b));
        }

    }
}
