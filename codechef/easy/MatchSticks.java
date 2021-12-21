package com.company.codechef.easy;
import java.util.Scanner;
public class MatchSticks {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b =sc.nextInt();
            int []arr = {6,2,5,5,4,5,6,3,7,6};
            int sum=a+b, matches=0;
            while(sum!=0){
                int num = sum%10;
                sum =sum/10;
                matches = matches+arr[num];
            }
            System.out.println(matches);
        }
    }
}
