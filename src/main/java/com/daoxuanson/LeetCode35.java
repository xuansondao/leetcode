package com.daoxuanson;

public class LeetCode35 {
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length;
        int middle;
        int rs = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (middle < length && nums[middle] == target) {
                rs = middle;
                break;
            } else if (middle < length && nums[middle] > target) {
                rs = middle;
                right = middle - 1;
            } else {
                rs = Math.max(rs, middle);
                left = middle + 1;
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3,5,6}, 2));
    }
}
