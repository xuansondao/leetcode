package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int max = arr[1];
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            map.put(arr[i], true);
        }

        int totalDiff = max - min;
        if (totalDiff % (n - 1) != 0) {
            return false;
        }
        int diff = (max - min) / (n - 1);
        while (min < max) {
            min += diff;
            if (!map.containsKey(min)) return false;
        }

        return true;

    }
}
