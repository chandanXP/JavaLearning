package com.company.codechef.easy;
import java.util.Scanner;

public class AmbiguousPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int size = sc.nextInt();
            int []arr = new int[size];
            for(int i=0; i<size; ++i){
                int val = sc.nextInt();
                arr[i]=val;
            }
            boolean res =true;
            for(int i=0; i<arr.length; ++i){
                int k = arr[i];
                if(k-1>arr.length-1 ||k==0){
                    res = false;
                    break;
                }
                if(arr[k-1] !=i+1){
                    res=false;
                    break;
                }
            }
            if(res){
                System.out.println("ambiguous");
            }
            else{
                System.out.println("not ambiguous");
            }
            --t;
        }
    }
}
