package com.company.codechef.easy;

import java.util.Scanner;

public class MagicPlanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0){
            int n =  sc.nextInt();
            StringBuffer  str = new StringBuffer(sc.next());
            int countB = 0;
            int countW =0;
            char first = str.charAt(0);
            for(int i =0; i<n; i++){
                if(str.charAt(i) == first){
                    continue;
                }
                System.out.println(0);
            }
            //BBWBWB

            char B = 'B';
            char W = 'W';
            for(int i=0; i<n; i++){
                if(str.charAt(i)==B){
                    continue;
                }
                else if(str.charAt(i)== 'W'){
                    //str.setCharAt(i, 'B');
                    if(str.charAt(i+1)==B){
                        countB++;
                    }
                    continue;
                }


                if(str.charAt(i)==W){
                    continue;
                }
                else if(str.charAt(i)== 'B'){
                    //str.setCharAt(i, 'W');
                    if(str.charAt(i+1)==W){
                        countW++;
                    }
                    continue;
                }
            }
            System.out.println(countB > countW ? countW:countB);
        }
    }
}






