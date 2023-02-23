package com.daoxuanson;

import java.util.Arrays;

public class LeetCode34 {
    public int binarySearch(int[] nums, int target, boolean findInStartIndex){
        int start = 0 ;
        int end =  nums.length - 1;
        int ans = -1;
        int middle;
        while (start <= end){
            middle = start + (end - start)/2;
            if (nums[middle] < target){
                start = middle + 1;
            }else if (nums[middle] > target){
                end = middle - 1;
            }else {
                ans = middle;
                if (findInStartIndex){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }
            }
        }


        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int start =  binarySearch(nums, target, true);
        int end;
        if (start != -1){
             end = binarySearch(nums, target, false);
        }else {
            end = start;
        }

        return new int[]{start, end};
    }


    public static void main(String[] args) {
        Arrays.stream(new LeetCode34().searchRange(new int[]{5,7,7,8,8,10}, 8)).forEach(System.out::println);
        ;
    }
}
