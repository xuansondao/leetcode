package com.daoxuanson;

import java.util.Arrays;

public class LeetCode16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs = Integer.MAX_VALUE;
        int k, j, sum, size = nums.length;
        int difference, min = Integer.MAX_VALUE;
        for (int i = 0; i < size - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            j = i + 1;
            k = size - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                difference = Math.abs(target - sum);
                if (sum == target) {
                    rs = sum;
                    min = difference;
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < target) {
                    if (difference < min) {
                        min = difference;
                        rs = sum;
                    }
                    j++;
                } else {
                    if (difference < min) {
                        min = difference;
                        rs = sum;
                    }
                    k--;
                }
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,1,-1,-1,3}, 3));
    }

}
