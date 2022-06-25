package com.company.JAVA500;

public class sqrt {
    public static void main(String[] args) {
        int n  =40;
        double x =Sqrt(11, 3);
        System.out.println(x);
        System.out.println(Math.sqrt(11));

    }
    static double Sqrt(int n , int p){

        int s=0;
        int e=n;
        double root = 0.0;
        while (s<=e){
            int mid = s+ (e-s)/2;

            if(mid * mid ==n){
                return mid;
            }
            else if(mid*mid > n){
                e=mid-1;
            }
            else {
                s = mid+1;
                root=mid;
            }
        }

        double inc = 0.1;
        for(int i =0 ; i<p; i++){
            while(root*root<=n){
                root += inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
}
