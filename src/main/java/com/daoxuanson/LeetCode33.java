package com.daoxuanson;

public class LeetCode33 {
    public int binarySearch(int[] nums, int start, int end, int target, boolean findInStartIndex) {
        int ans = -1;
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                ans = middle;
                if (findInStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }


        return ans;
    }

    public int search(int[] nums, int target) {
        int start1 = 0;
        int start2 = 0;
        int end1 = 0;
        int end2 = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                end1 = i;
                start2 = i + 1;
                break;
            }
        }

        int index = binarySearch(nums, start1, end1, target, true);
        if (index < 0) {
            index = binarySearch(nums, start2, end2, target, true);
        }

        return index < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode33().search(new int[]{1}, 1));
    }
}
