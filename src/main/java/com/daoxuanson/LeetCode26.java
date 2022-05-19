package com.daoxuanson;

public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            } else {
                j++;
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
}
