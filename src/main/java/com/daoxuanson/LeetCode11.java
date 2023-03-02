package com.daoxuanson;

public class LeetCode11 {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area;
        int max = 0;
        while (i < j) {
            area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }



        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
