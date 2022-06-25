package com.company.SortingAlgos;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {5,4, 3 ,2 ,1,0};
        quick_sort(a , 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
    static void quick_sort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start +(end- start)/2;
        int pivot = arr[mid];
        while(start<=end){
            //5 4 3 2 1 0
            while(arr[start]< pivot){
                start++;
            }
            while (arr[end]> pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        // now pivot is at correct index now sort two halves
        quick_sort(arr,low, end );
        quick_sort(arr, start, high);
    }

}
