package com.company.codechef.easy;
import java.util.Scanner;
public class ChefFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int num = x+y;
            ++num;
            for(int i=2; i<num;++i){
                if(num%i==0){
                    num++;i=1;
                }
            }
            System.out.println(num - (x+y));
            --t;
        }
    }
}
