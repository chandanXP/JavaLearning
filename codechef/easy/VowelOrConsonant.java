package com.company.codechef.easy;
import  java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0){
            char c = sc.next().charAt(0);
            if( c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
            --t;
        }
    }
}
