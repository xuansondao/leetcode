package com.daoxuanson.array;

/*
 * link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * */

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        int length = nums.length;
        if (length == 1 && nums[length - 1] == 1) return length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) {
                counter++;
                if (i + 1 < length && nums[i + 1] == 1) {
                    counter++;
                    if (i+1 == length - 1) {
                        if (max < counter) {
                            max = counter;
                        }
                    }
                    i++;
                } else {
                    if (max < counter) {
                        max = counter;
                    }
                    counter = 0;
                }
            } else {
                if (max < counter) {
                    max = counter;
                }
                counter = 0;
            }
        }

        return max == 0 ? Math.max(max, counter) : max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

}
