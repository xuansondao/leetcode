package com.daoxuanson;

public class LeetCode1523 {
    public int countOdds(int low, int high) {
        if (high < low) return 0;
        if (low % 2 != 0 || high % 2 != 0) return (high - low) / 2 + 1;
        return (high - low) / 2;
    }

    public static void main(String[] args) {

    }
}
