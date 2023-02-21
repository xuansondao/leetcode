package com.daoxuanson;

public class LeetCode189 {
    public static void rotate(int[] nums, int k) {
        while( nums.length - k < 0) {
            k = k - nums.length;
        }
        if( nums.length - k == 0 ) {
            return;
        }
        int[] left = new int[nums.length -k];
        System.arraycopy(nums,0,left,0,left.length);
        int[] right = new int[k];
        System.arraycopy(nums,left.length,right,0,right.length);
        System.arraycopy(right,0,nums,0,right.length);
        System.arraycopy(left,0,nums,right.length,left.length);
    }

    public static void reverse(int[] res, int start, int end) {
        while (start < end) {
            int temp = res[end];
            res[end] = res[start];
            res[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2}, 3);
    }
}
