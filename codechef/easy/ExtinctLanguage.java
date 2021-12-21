package com.company.codechef.easy;
import  java.util.Scanner;
public class ExtinctLanguage {
    static void Insert(String []arr){
        Scanner s = new Scanner(System.in);
        for(int i=0; i<arr.length; ++i)
            arr[i] =s.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        String []arr = new String[size];
        Insert(arr);
        for(int i=0; i<n;++i){
            int pSize = sc.nextInt();
            String []Phrase =new String[pSize];
            Insert(Phrase);
            boolean res =false;
            for (String r:arr) {
                for(String k : Phrase){
                    if(r.equals(k)){
                        res=true;
                        break;
                    }
                }
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
