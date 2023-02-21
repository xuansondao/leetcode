package com.daoxuanson;

import java.util.Arrays;

public class LeetCode283 {
    public void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;
        int n = nums.length;
        while (i < n && j < n) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    swap(nums, i, j);
                }
                j++;
            } else {
                i++;
            }

        }

        Arrays.stream(nums).forEach(System.out::println);
    }


    public static void main(String[] args) {
//        new LeetCode283().moveZeroes(new int[]{0, 1, 0, 3, 12});
        new LeetCode283().moveZeroes(new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0});
    }
}
