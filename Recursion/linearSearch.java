package com.company.Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int a[] = {1, 44,2 ,3,4,33, 44 ,100, 0,44, 10};
        //int n = search_last(a, a.length-1, 44);
        //System.out.println(n);
        search_all_index(a, 0, 44);
    }
    static int search_first(int a[], int i, int target){
        if(i>a.length-1){
            return -1;
        }
        else if(a[i] ==target){
            return i;
        }
        return search_first(a, i+1, target);
    }

    static int search_last(int a[], int i, int target){
        if(i<0){
            return -1;
        }
        else if(a[i] ==target){
            return i;
        }
        return search_last(a, i-1, target);
    }

    static void search_all_index(int a[], int i, int target){
        if(i>a.length-1){
            return;
        }
        else if(a[i] ==target){
            System.out.println(i);
        }

        search_all_index(a, i+1, target);
    }

}
