package com.company.codechef.easy;
import java.util.Scanner;

public class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String text = sc.next();
            StringBuilder sb = new StringBuilder(text);

            if(text.length()%2!=0){
                sb.deleteCharAt(text.length()/2);//if the string is odd we can ignore/remove the middle character
            }
            String subLeft = sb.substring(0,(sb.length()/2));//left substring
            String subRight = sb.substring(sb.length()/2, sb.length());//right substring
            int freq1=0, freq2=freq1;//initially both the frequencies assumed to be same and zero
            boolean res = true;
            //conditions
            for(int i=0; i<sb.length()/2; ++i){
                char c = subLeft.charAt(i);
                for( int j =0;j<sb.length()/2; ++j ){
                    if( c==subLeft.charAt(j) ){
                        ++freq1;
                    }
                    if( c==subRight.charAt(j) ){
                        ++freq2;
                    }
                }
                if(freq1!=freq2) {
                    res =false;
                    break;
                }
            }
            if(!res){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            --t;
        }

    }
}
