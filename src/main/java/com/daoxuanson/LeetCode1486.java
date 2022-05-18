package com.daoxuanson;

public class LeetCode1486 {
    public static int xorOperation(int n, int start) {
        int result = start;
        int k;
        for (int i = 1; i < n; i++) {
            k = start + 2 * i;
            result = result ^ k;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }
}
