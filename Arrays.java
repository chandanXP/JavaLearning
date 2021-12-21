package com.company;

public class Arrays {
    public static void main(String[] args) {
        //First way
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 75;
        marks[2] = 80;
        marks[3] = 85;
        marks[4] = 88;

        //Second way
        int [] roll_no;
        roll_no = new int[5];

        //Third way
        int []age = {15, 16,13,14,16};

        //System.out.println(marks[2]);
        System.out.println(marks.length);
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        /*
        //Reverse order
        for(int j = marks.length-1; j>=0; --j){
            System.out.println(marks[j]);
        }

        //using for each loop
        for(int element: marks){
            System.out.println(element);
        }
        */
    }
}
