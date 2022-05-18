package com.daoxuanson;

import java.util.Arrays;

public class LeetCode1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int length = nums.length;
        int k = length - n;
        int j = 0;
        for (int i = 0; i < k; i++) {
            result[j++] = nums[i];//2
            result[j++] = nums[i + k];//3
        }

        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(shuffle(new int[]{1,1,2,2}, 2)).forEach(System.out::println);
    }
}
