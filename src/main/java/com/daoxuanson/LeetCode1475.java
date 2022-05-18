package com.daoxuanson;

import java.util.Arrays;

public class LeetCode1475 {
    public static int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }

    public static void main(String[] args) {
        Arrays.stream(finalPrices(new int[]{1,2,3,4,5})).forEach(System.out::println);
    }
}
