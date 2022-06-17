package com.daoxuanson;

import java.util.*;

public class LeetCode2032 {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int j : nums1) {
            map.put(j, false);
        }
        int[] temp2 = new int[101];
        for (int j : nums2) {
            if (temp2[j] == 0 && map.containsKey(j)) {
                map.put(j, true);
            } else {
                map.put(j, false);
                temp2[j]++;
            }
        }
        int[] temp3 = new int[101];
        for (int j : nums3) {
            if (temp3[j] == 0 && map.containsKey(j)) {
                map.put(j, true);
            } else {
                map.put(j, false);
                temp3[j]++;
            }
        }
        List<Integer> result = new ArrayList<>();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (map.get(key)) {
                result.add(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        twoOutOfThree(new int[]{1, 2, 2}, new int[]{4, 3, 3}, new int[]{5}).forEach(System.out::println);
    }
}
