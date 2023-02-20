package com.daoxuanson;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class LeetCode1958 {
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for (String s : nums) {
            pq.offer(new BigInteger(s));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll().toString();
    }

    public static void main(String[] args) {
    }
}
