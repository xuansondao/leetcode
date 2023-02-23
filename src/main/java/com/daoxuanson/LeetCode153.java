package com.daoxuanson;

public class LeetCode153 {
    public int findMin(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]){
                ans = nums[i+1];
                break;
            }
        }

        return ans == - 1 ? nums[0] : ans;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode153().findMin(new int[]{3,4,5,1,2}));
    }
}
