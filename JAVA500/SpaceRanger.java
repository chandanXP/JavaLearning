package com.company.JAVA500;

import java.util.Scanner;

public class SpaceRanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Launch_hr = sc.nextInt();
        int Launch_min = sc.nextInt();
        int travel_time_hr = sc.nextInt();
        int travel_time_min = sc.nextInt();
        int dest_hr;
        int dest_min=0;

        //for min
        int temp =  travel_time_min + Launch_min;
        if(temp>=60){
            dest_min = temp - 60;
            travel_time_hr++;
        }

        //for hr
        dest_hr = travel_time_hr + Launch_hr;
        if(dest_hr>=24){
            dest_hr =  dest_hr - 24;
        }
        System.out.println(String.format("%02d", dest_hr) + " "+ String.format("%02d", dest_min));
    }
}
