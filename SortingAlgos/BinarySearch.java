package com.company.SortingAlgos;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {3, 3, 5, 9, 23, 56, 145,1131, 1166, 1199};
        int res= binary_search(a, 1166);
        System.out.println(res);
    }
    static int binary_search(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        while(start<= end){
            int mid  = start + (end-start) /2;
            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target> arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
