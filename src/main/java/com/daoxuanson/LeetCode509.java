package com.daoxuanson;

public class LeetCode509 {
    public int fib(int n) {
        int[] fi = new int[31];
        fi[0] = 0;
        fi[1] = 1;
        for (int i = 2; i <= n; i++) {
            fi[i] = fi[i-1] + fi[i-2];
        }

        return fi[n];
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode509().fib(3));
    }
}
