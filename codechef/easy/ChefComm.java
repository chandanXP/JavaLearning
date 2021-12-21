package com.company.codechef.easy;
import java.util.Scanner;
public class ChefComm {
    static double distance(int x1 ,int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1-y1,2) + Math.pow(x2-y2,2));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            int R  = sc.nextInt();
            int x1 =sc.nextInt();
            int y1 = sc.nextInt();
            int x2 =sc.nextInt();
            int y2 =sc.nextInt();
            int x3 =sc.nextInt();
            int y3=sc.nextInt();
            double d1 = distance(x1,y1,x2,y2);
            double d2 = distance(x2,y2,x3,y3);
            double d3 = distance(x1,y1,x3,y3);
            System.out.println(d1+ " "+ d2+" "+d3);
            if( (R>=d1) && (R>=d2) && (R>=d3) ){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            --t;
        }
    }
}
