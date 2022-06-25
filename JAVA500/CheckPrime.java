package com.company.JAVA500;

public class CheckPrime {
    public static void main(String[] args) {
        int N = 40;
        boolean a[] = new boolean[N+1];

        prime(N,a);

    }
    static void prime(int n, boolean[]a){
        for(int i=2; i*i<=n; i++){
            if(!a[i]){
                for(int j=i*2; j<=n; j+=i){
                    a[j] = true;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(!a[i]){
                System.out.print(i+ " ");
            }
        }
    }

}
