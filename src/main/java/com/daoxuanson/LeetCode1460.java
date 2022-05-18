package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int result = 0;
        int sumTarget = 0;
        int sumArray = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        int n = target.length;
        for (int j : target) {
            map.put(j, true);
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            sumTarget += target[i];
            sumArray += arr[i];
            if (map.containsKey(arr[i])) count++;
            result = result ^ target[i] ^ arr[i];
        }

        return result == 0 && (sumTarget == sumArray) && count == n;
    }

    public static void main(String[] args) {

        System.out.println(canBeEqual(new int[]{937,396,309,316,278,305,937,563,385,816,333,523,874,47,281,984,431,692},
                new int[]{937,385,816,937,309,523,281,278,316,396,984,431,47,333,692,874,563,305}));
    }
}
