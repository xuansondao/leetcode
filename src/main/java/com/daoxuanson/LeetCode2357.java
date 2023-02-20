package com.daoxuanson;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2357 {
    public static int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num != 0)
                set.add(num);
        }

        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,2,3,5}));
    }
}
