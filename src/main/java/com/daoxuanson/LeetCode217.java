package com.daoxuanson;

import java.util.Arrays;

public class LeetCode217 {
//    public boolean containsDuplicate(int[] nums) {
//        int length = nums.length;
//        if (length < 2) return false;
//        if (length == 2) return nums[0] == nums[1];
//        Arrays.sort(nums);
//        for (int i = 0; i < length - 1; i++) {
//            if (nums[i] == nums[i+1]) return true;
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums){

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode217().containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
