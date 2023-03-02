package com.daoxuanson;

import java.util.*;

public class LeetCode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> h = new HashMap<>();
        for (int num : nums) h.put(num, h.getOrDefault(num, 0) + 1);
        Comparator<Map.Entry<Integer, Integer>> t = (a, b) -> b.getValue() - a.getValue();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(t);

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            pq.offer(entry);
        }

        int[] results = new int[k];

        for (int i = 0; i < k; i++)
            results[i] = pq.poll().getKey();

        return results;
    }

    public static void main(String[] args) {
        Arrays.stream(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)).forEach(System.out::println);
    }
}
