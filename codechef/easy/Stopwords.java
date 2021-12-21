package com.company.codechef.easy;
import java.util.Scanner;

public class Stopwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = " "+str+" ";
        String []stop_words = { "a", "it", "the", "and", "an", "is", "all", "also", "another", "are", "can", "for", "this"};
        for(String i : stop_words){
            String temp = " " + i + " ";
            if(str.contains(temp) ) {
                str = str.replaceAll(temp, " ");
            }
        }
        System.out.println(str);
    }
}
