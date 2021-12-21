package com.company.codechef.easy;
import java.util.Scanner;
public class CopsAndThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int size = sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int dist = x*y;
            int []arr =new int[size];
            for(int i=0; i<arr.length; ++i){
                arr[i] = sc.nextInt();
            }
            int []house = new int[100];
            int count=0;
            for(int ele: arr){
                int min_range = ele - dist;
                int max_range = ele + dist;
                if(min_range<0){
                    min_range=0;
                }else if(max_range>99){
                    max_range=99;
                }
                for(int j=min_range; j<=max_range; ++j){
                    house[j] = j+1;
                }
            }
            for(int i=0; i<house.length;++i){
                if(house[i]==i+1){
                    ++count;
                }
            }
            System.out.println(100-count);
        }
    }
}
