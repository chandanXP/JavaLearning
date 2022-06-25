package com.company.Practice;

class JavaPractical{
    public static void main(String args[]){
        StringBuffer string1=new StringBuffer("I am chandan roll number 45.");
        System.out.println("String 1: "+string1);
        StringBuffer string2=new StringBuffer("Today is my JAVA practical exam.");
        System.out.println("String2: "+string2);

        StringBuffer string3 = string1.append(string2);
        System.out.println("Concatenated: "+string3);//concatenation of string1 and string2

        System.out.println("Reverse: "+string3.reverse());//reverse of string3

        System.out.println("Capacity: "+string3.capacity());//capacity of the string3

        string3.delete(4,4);//deleting string at index 4
        System.out.println("Deleted: "+string3);

        System.out.println("Submitted by Chandan 45 CSE-A");

    }
}


