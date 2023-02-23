package com.daoxuanson;

import java.util.Arrays;

public class LeetCode1011 {
    public int shipWithinDays(int[] a, int days) {
        int lo = 0, hi = 0;
        for (int j : a) {
            lo = Math.max(lo, j);
            hi += j;
        }

        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (check(mid, a, days))
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }


    boolean check(int capacity, int[] weights, int days) {
        int currentWeight = 0;
        --days;
        for (int weight : weights) {
            if (currentWeight + weight <= capacity)
                currentWeight += weight;
            else {
                --days;
                currentWeight = weight;
            }
        }
        return days >= 0;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1011().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));;
    }
}
