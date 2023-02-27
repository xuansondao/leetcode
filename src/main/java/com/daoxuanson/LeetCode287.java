package com.daoxuanson;


import java.util.HashMap;
import java.util.Map;

public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) return nums[i];
            map.put(nums[i], 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode287().findDuplicate(new int[]{1,3,4,2,1}));
    }
}
