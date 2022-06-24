//package com.company;
//
//public class TwoDSortedMatrix {
//    public static void main(String[] args) {
//
//    }
//    //search in the row provided between the col provided
//    static  int[] binary_search(int matrix[][], int start, int end,int rows,int cols, int target){
//        while (start<=end){
//            int mid= start + (end-start)/2;
//            if(matrix[rows][cols] == target){
//                return new int[]{rows, cols};
//            }
//            if(matrix[rows][cols]<target){
//                start = mid+1;
//            }else {
//                 end = mid-1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//
//
//    static  int [] search(int[][]matrix, int target){
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        if(rows==1){
//            return binary_search(matrix, 0, cols-1, 0 target);
//        }
//        int rStart =0;
//        int rEnd = rows-1;
//        int cMid = cols/2;
//        //run the loop till 2 rows are remaining
//        while (rStart< (rEnd-1)){//while its true it has more than two rows
//            int mid  = rStart + (rEnd - rStart) /2;
//            if(matrix[mid][cMid] == target){
//                return  new int []{mid, cMid};
//            }
//            else if(matrix[mid][cMid] < target){
//                rStart = mid;
//            }
//            else{
//                rEnd = mid;
//            }
//        }
//
//        //now we have two rows
//        //check whether the target is in the col
//        if(matrix[rStart][cMid] == target){
//            return new int[]{rStart, cMid};
//        }
//        if(matrix[rStart +1][cMid]== target){
//            return new int[]{rStart+1, cMid};
//        }
//        //other-wise check in 1, 2 3 and 4th halve
//        //incomplete: kunal khushwaha channel
//
//
//
//    }
//
//}
