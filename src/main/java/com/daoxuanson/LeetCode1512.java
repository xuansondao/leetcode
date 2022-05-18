package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1512 {
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                result += count;
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] i = new int[]{
                1,1,1,1
        };
        System.out.println(numIdenticalPairs(i));
    }
}
