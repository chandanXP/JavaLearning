package com.company.codechef.easy;
import java.util.Scanner;
public class WildCardStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            String str1 =sc.next();
            String str2 =sc.next();
            boolean res= true;
            for(int i=0; i<str1.length(); ++i){
                if(str1.charAt(i )=='?' || str2.charAt(i)=='?' || str1.charAt(i)==str2.charAt(i)){
                    continue;
                }
                if(str1.charAt(i)!=str2.charAt(i)){
                    res =false;
                    break;
                }
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
