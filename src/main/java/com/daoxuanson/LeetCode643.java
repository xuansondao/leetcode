package com.daoxuanson;

public class LeetCode643 {
    public double findMaxAverage(int[] nums, int k) {
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int res = sum;
        for (int i = k; i < length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > res) res = sum;
        }


        return res / (k * (1.0));
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode643().findMaxAverage(new int[]{5}, 1));
    }
}
