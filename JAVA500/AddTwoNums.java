package com.company.JAVA500;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m  = sc.nextInt();

        LinkedList<Integer> l1 = new LinkedList<>();
        for(int i=0 ; i<n; i++){
            l1.add(sc.nextInt());
        }

        LinkedList<Integer> l2 = new LinkedList<>();

        for(int i=0 ; i<m; i++){
            l2.add(sc.nextInt());
        }

        LinkedList<Integer> res = new LinkedList<>();
        int size =  Math.max(l1.size(), l2.size());
        int carry = 0;
        int digit;
        int container;
        for(int i=0; i < size ; i++){
            digit=0;

            if(i>=l1.size()){
                container = l2.get(i);
            }
            else if(i>=l2.size()){
                container = l1.get(i);
            }
            else{
                container = l1.get(i) + l2.get(i);

            }

            if( (container + carry) > 9 ){
                digit = (container + carry) -10;
            }

            res.add(digit);

            if( ( container + carry ) > 9 ){
                carry=1;
            }

        }

        if(carry==1){
            res.add(carry);
        }

        System.out.println(res);

    }
}
