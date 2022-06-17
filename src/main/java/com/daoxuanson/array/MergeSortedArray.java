package com.daoxuanson.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int resultIndex = 0;
        int numsOneIndex = 0;
        int numsTwoIndex = 0;
        int[] rs = new int[m + n];
        while (resultIndex < m + n) {
            if (numsTwoIndex < n && nums1[numsOneIndex] >= nums2[numsTwoIndex]) {
                rs[resultIndex++] = nums2[numsTwoIndex++];
            } else if (numsTwoIndex < n && numsOneIndex < m && nums1[numsOneIndex] < nums2[numsTwoIndex]) {
                rs[resultIndex++] = nums1[numsOneIndex++];
            } else if (numsTwoIndex == n) {
                rs[resultIndex++] = nums1[numsOneIndex++];
            } else {
                rs[resultIndex++] = nums2[numsTwoIndex++];
            }
        }

        System.arraycopy(rs, 0, nums1, 0, nums1.length);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1, 1, nums2, 1);
        Arrays.stream(nums1).forEach(System.out::println);

    }
}
