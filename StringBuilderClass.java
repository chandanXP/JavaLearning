package com.company;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.setCharAt(0, 'd');
        /*
        char []value= new char[10];
        sb.getChars(1, 3,value,0);
        */
        sb.insert(2,'y');
        sb.deleteCharAt(4);
        sb.append('g');
        int len = sb.length();
        sb.append('s');
        String subLeft = sb.substring(0,sb.length()/2);
        System.out.println(sb);

    }
}
