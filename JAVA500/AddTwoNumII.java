package com.company.JAVA500;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNumII {
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

        Iterator<Integer> it1 =  l1.iterator();
        Iterator<Integer> it2=  l2.iterator();
        Integer num1;
        Integer num2;
        while (it1.hasNext() || it2.hasNext()){
            //digit=0;
            if( it1.next() ==null ){
                num1 = 0;
                num2 = it2.next();
            }
            else if(it2.next()==null){
                num1 = it1.next();
                num2 = 0;
            }
            else{
                num1 = it1.next();
                num2= it2.next();
            }

            digit = num1 + num2 + carry;
            if(digit > 9){
                digit = digit -10;
            }
            res.add(digit);
            if( (num1 + num2 +  carry) > 9){
                carry = 1;
            }

        }

        if(carry==1){
            res.add(carry);
        }

        System.out.println(res);
    }
}
