package com.daoxuanson;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode502 {
    class Pair implements Comparable<Pair> {
        int capital, profit;

        public Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        public int compareTo(Pair pair) {
            return capital - pair.capital;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Pair[] projects = new Pair[n];
        for (int i = 0; i < n; i++) {
            projects[i] = new Pair(capital[i], profits[i]);
        }

        Arrays.sort(projects);
        PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        int ans = w;
        for (int i = 0; i < k; i++) {
            while (j < n && projects[j].capital <= ans) {
                priority.add(projects[j++].profit);
            }
            if (priority.isEmpty()) {
                break;
            }
            ans += priority.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode502().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }
}
