package com.company.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2, 3, 4, 5, 6 ,7 ,10, 23, 24, 67};
        int idx = search(a, 10, 0,a.length-1);
        System.out.println(idx);
    }
    static int search(int a[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+ (e-s)/2;
        if(a[mid]== target){
            return mid;
        }
        else if(a[mid] > target){
            return search(a, target, s, mid-1);
        }
        return search(a, target, mid+1, e);
    }

}
