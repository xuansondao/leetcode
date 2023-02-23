package com.daoxuanson;

public class LeetCode502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        w = 0;
        int max;
        for (int i = 0; i < k; i++) {
            max = 0;
            int j = 0;
            for (; j < capital.length; j++) {
                if (capital[j] == i) {
                    if (max < profits[j]) {
                        max = profits[j];
                    }
                }
            }
            if (i == 0 && max == 0){
                return 0;
            }
            w += max;

        }

        return w;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode502().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }
}
