package com.company;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks: ");
        float total_marks = sc.nextInt();
        System.out.println("Marks obtained: ");
        float marks_obtained = sc.nextInt();
        float percentage = (marks_obtained/total_marks)*100;
        System.out.println("Percentage of student: "+percentage);
    }

}
