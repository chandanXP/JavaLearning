package com.company.Practice;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        double mile = 0.621;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kilometer: ");
        float dist_kilometers = scan.nextFloat();
        double dist_miles= mile*dist_kilometers;
        System.out.println(dist_miles+" miles");
    }
}
