package com.daoxuanson;

import java.util.Arrays;

public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        int middle;
        int sum = 0;
        int count =  0 ;
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (sum + nums[middle] == target) {
                return 1;
            } else if (sum + nums[middle] < target) {
                sum += nums[middle];
                count++;
                start = middle + 1;
            } else {
                end = middle - 1;
            }

        }
        System.out.println(sum);
        if (sum != target) return 0;

        return count;
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode209().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
