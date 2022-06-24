package com.company.JAVA500;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int id_x=-1, id_y=-1, dist=Integer.MAX_VALUE, curr_dist=0;
        for(int i=0; i<n; i++){
            if(a[i] == x){
                id_x = i;
                if(id_x < 0 || id_y < 0){
                    continue;
                }
                curr_dist = Math.abs(id_x - id_y);
                if(dist > curr_dist){
                    dist = curr_dist;
                }
            }
            else if(a[i] == y){
                id_y = i;
                if(id_x < 0 || id_y < 0){
                    continue;
                }
                curr_dist = Math.abs(id_x - id_y);
                if(dist > curr_dist){
                    dist = curr_dist;
                }
            }
        }
        if(dist == Integer.MAX_VALUE){
            dist =-1;
        }

        System.out.println(dist);
    }
}
