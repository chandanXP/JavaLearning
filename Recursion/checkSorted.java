package com.company.Recursion;

public class checkSorted {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5};
        boolean res = check_sort(a, 0);
        System.out.println("Sorted?: " +res);
    }
    static boolean check_sort(int a[], int idx) {
        //1 2 3 4 5
        if (idx == a.length - 2) {
            return true;
        }
        else if (a[idx] <= a[idx + 1]) {
            return check_sort(a, idx + 1);
        }
        else{
            return  false;
        }

    }
}
