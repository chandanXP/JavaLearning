package com.company.codechef.easy;
import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            boolean res = false;
            if(str.length()%2 == 0){
                for(int i=0;i<str.length();i++){
                    char c = str.charAt(i);
                    long occurrence  = str.chars().filter(ch->ch==c).count();
                    if(occurrence == str.length()/2){
                        res =true;
                    }
                }
            }
            else{
                res = false;
            }

            if(res){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
