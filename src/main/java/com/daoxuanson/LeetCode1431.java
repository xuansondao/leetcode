package com.daoxuanson;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) max = candy;
        }
        List<Boolean> results = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                results.add(true);
            } else {
                results.add(false);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{4,2,1,1,2}, 1).forEach(System.out::println);
    }
}
