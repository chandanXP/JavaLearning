package com.company.Practice;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int a[] = {-5,-1,3, 3, 5, 9, 23, 56, 145,1131, 1166, 1199};
        int b[] = {1000, 333, 250, 122, 99, 41,37,33,20,19,0, -1, -5, -9};
        int res= OABinarySearch(a, 1166);
        int res1 = OABinarySearch(b,0);
        System.out.println(res);
        System.out.println(res1);
    }
    static int OABinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc =arr[0] <arr[arr.length-1];
        while(start<= end){
            int mid  = start + (end-start) /2;
            if(arr[mid] == target){
                return  mid;
            }
            if(isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else {
                if(target< arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
