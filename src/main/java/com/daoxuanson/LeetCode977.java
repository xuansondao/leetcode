package com.daoxuanson;

import java.util.Arrays;

public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }


    public static void main(String[] args) {
        Arrays.stream(new LeetCode977().sortedSquares(new int[]{-4,-1,0,3,10})).forEach(System.out::println);
    }
}
