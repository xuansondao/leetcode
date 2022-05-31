package com.daoxuanson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int k, j, sum, size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            j = i + 1;
            k = size - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4}).forEach(rs -> {
            rs.forEach(t -> System.out.print(t + " "));
            System.out.println(" ");
        });
    }
}
