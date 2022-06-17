package com.daoxuanson.array;

/*
*link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
* đề: Given an array nums of integers, return how many of them contain an even number of digits.
* example:
* Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 * */
public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int number = (int) Math.log10(num) + 1;
            if ((number & 1) == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{252}));
    }
}
