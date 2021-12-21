package com.company;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //array of arrays
        int []arr;
        int [][]flats;
        flats = new int [2][3];//2-D array
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;
        for(int i=0; i< flats.length; i++){
            for(int j=0; j< flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
