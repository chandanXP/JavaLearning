package com.company.codechef.easy;
import java.util.Scanner;

public class IdShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            char i = sc.next().charAt(0);
            if(i=='b' || i=='B'){
                System.out.println("BattleShip");
            }
            else if(i=='c' || i=='C'){
                System.out.println("Cruiser");
            }
            else if(i=='d' ||i== 'D'){
                System.out.println("Destroyer");
            }
            else if(i=='f' || i =='F'){
                System.out.println("Frigate");
            }
            --t;
        }
    }
}
