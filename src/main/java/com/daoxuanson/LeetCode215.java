package com.daoxuanson;

import java.util.PriorityQueue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) maxHeap.poll();
        }

        return maxHeap.poll();
    }

    public static void main(String[] args) {

    }
}
