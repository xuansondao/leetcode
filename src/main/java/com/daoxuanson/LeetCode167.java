package com.daoxuanson;

import java.util.Arrays;

public class LeetCode167 {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int middle;
        while (start <= end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                return new int[]{start + 1, end+1};
            } else if (sum < target) {
                start++;
            }else {
                end--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2,7,11,15}, 22)).forEach(System.out::println);
    }
}
