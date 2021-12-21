package com.company.codechef.easy;
import java.util.ArrayList;
import java.util.Scanner;

public class ChefRecipe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t  = sc.nextInt();
        while(t!=0){
            int size = sc.nextInt();
            int []arr =  new int[size];
            for(int i=0; i<size; ++i){
                int val= sc.nextInt();
                arr[i]=val;
            }
            ArrayList<Integer> res = new ArrayList<>(size);
            for(int i =2; i<1000;++i){
                if(res.size()>=size){
                    break;
                }
                for( int j=0; j< arr.length;++j ){
                    if( (arr[j]%i!=0) && (j==0) ){
                        break;
                    }
                    else if( (arr[j]%i!=0) && (j>0) ){
                        res.clear();
                        break;
                    }
                    else{
                        res.add(arr[j]/i);
                    }
                }
            }
            if(res.size()==0){
                for(Integer n: arr){
                    System.out.print(n +" ");
                }
            }
            else{
                for(Integer n: res){
                    System.out.print(n+" ");
                }
            }
            System.out.println("\n");
            --t;
        }
    }
}
