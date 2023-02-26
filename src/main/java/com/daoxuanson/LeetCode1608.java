package com.daoxuanson;

import java.util.Arrays;
import java.util.Map;

public class LeetCode1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < ans) {
                left = middle + 1;
                ans++;
            } else if (nums[middle] > ans) {
                ans = Math.max(nums[middle], ans);
                right = middle - 1;
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        System.out.println(new LeetCode1608().specialArray(new int[]{0,4,3,0,4}));
    }
}
