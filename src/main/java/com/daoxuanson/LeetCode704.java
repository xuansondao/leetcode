package com.daoxuanson;

import java.util.Arrays;

public class LeetCode704 {
    public static int search(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        return Math.max(result, -1);
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
