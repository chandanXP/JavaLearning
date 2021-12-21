package com.company.codechef.easy;
import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String is a class in java
        //strings are immutable
        /*
        String name = new String("Harry");
        System.out.println(name);
        String name2 = "Chandan";
        System.out.println(name2);
        System.out.printf("first name is %s and second name is %s " ,name, name2);

        System.out.println("Enter you response");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

         */
        String message = "this is string in java.";
        String untrimmedString = "     this is untrimmed string     ";
        System.out.println(message.length());
        System.out.println(message.toLowerCase());//gives string in lower case
        System.out.println(message.toUpperCase());//gives string in upper case
        System.out.println(untrimmedString.trim());//removes the spaces from left and right of a string
        System.out.println(message.substring(5));//will make a substring from original string to substring
        System.out.println(message.substring(2,8));//will make a substring from original string to substring
        System.out.println(message.replace('u', 'o'));//replace the characters in a string
        System.out.println(message.replace("java", "python"));//replace the string in a string
        System.out.println(message.startsWith("this")); //true or false
        System.out.println(message.endsWith("java")); //true or false
        System.out.println(message.charAt(10)); //character at index
        System.out.println(message.indexOf("string", 4)); //gives the first index of string or char
        System.out.println(message.lastIndexOf("is")); //gives the last index of string or char, search from right ot left
        System.out.println(message.lastIndexOf("is", 8)); //gives the last index of string or char, search from right ot left
        System.out.println(message.equals("string")); //will check if the string is matching or not the case
        System.out.println(message.equalsIgnoreCase("this is string in python")); //will check if the string is matching or not, ignoring the case



    }
}
