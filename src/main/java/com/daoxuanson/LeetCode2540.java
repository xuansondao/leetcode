package com.daoxuanson;

public class LeetCode2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
               return nums1[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode2540().getCommon(new int[]{1,2,3}, new int[]{2,4}));
    }
}
