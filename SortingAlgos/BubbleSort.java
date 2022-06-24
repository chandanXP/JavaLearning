package com.company.SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        //bubble_sort(arr);
        //selection_sort(arr);
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int []arr){
        for (int i =0; i<arr.length; i++){
            boolean swapped = false;
            for (int j=1; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    static  void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    static int getMAx(int arr[], int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] <arr[i]){
                max = i;//index
            }
        }
        return max;
    }


    static void selection_sort(int []arr){
        //{3,1,5,4,2}
        for (int i=0; i< arr.length; i++){
            int last = arr.length-1 -i;
            int max = getMAx(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static  void insertion_sort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] <arr[j-1]){
                    swap(arr, j,j-1);
                }else{
                    break;
                }
            }

        }
    }
}
