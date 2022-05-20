package com.daoxuanson;

import java.util.*;

public class LeetCode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        long number0 = Arrays.stream(nums).filter(n -> n == 0).count();
        if (number0 >= 3) {
            return List.of(List.of(0, 0, 0));
        }
        int n = nums.length;
        if (n < 3) return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], i + map.get(nums[i]));
            } else {
                map.put(nums[i], i);
            }

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                int k = -1 * sum;
                if (map.containsKey(k)) {
                    int index = map.get(k);
                    if (k == nums[i] && index != i) {
                        index = index - i;
                    } else if (k == nums[j] && index != j) {
                        index = index - j;
                    }
                    if (index > -1 && index < n && i < j && j < index) {
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(k);
                        if (!results.contains(result)) {
                            results.add(result);
                        }
                    }
                }
            }
        }

        return results;
    }


    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4}).forEach(rs -> {
            rs.forEach(t -> System.out.print(t + " "));
            System.out.println(" ");
        });
    }
}
