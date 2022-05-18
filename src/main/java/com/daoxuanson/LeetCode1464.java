package com.daoxuanson;

public class LeetCode1464 {
    public static int maxProduct(int[] nums) {
        int max = 0;
        int max1 = 0;
        for (int num : nums) {
            if (num > max) {
                max1 = max;
                max = num;
            } else if (num > max1) {
                max1 = num;
            }
        }


        return (max - 1) * (max1 - 1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10, 2, 5, 2}));
    }
}
