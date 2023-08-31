package com.daoxuanson;

public class LeetCode54 {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length < 1) return 0;
        if (length == 1) return nums[0];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = sum + num;
            max = Math.max(sum, max);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}
