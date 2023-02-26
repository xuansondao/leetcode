package com.daoxuanson;

public class LeetCode852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        int middle;
        while (left <= right) {
            middle = left + (right - left + 1) / 2;
            if (middle + 1 < arr.length) {
               if (arr[middle] > arr[middle + 1]){
                   if (middle - 1 > -1 ) {
                       if (arr[middle] <= arr[middle - 1]) {
                           right = middle - 1;
                       }else {
                           return middle;
                       }
                   }
               }else {
                    if (middle - 1 > -1){
                        if (arr[middle] < arr[middle - 1]){
                            return middle;
                        }else {
                            left = middle + 1;
                        }
                    }
               }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode852().peakIndexInMountainArray(new int[]{0,1,0}));
    }
}
