package com.daoxuanson;

public class LeetCode5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int maxLength = 0;
        String longest = null;

        int length = s.length();
        boolean[][] table = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            table[i][i] = true;
            longest = s.substring(i, i + 1);
            maxLength = 1;
        }

        for (int i = 0; i < length - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                longest = s.substring(i, i + 2);
                maxLength = 2;
            }
        }


        for (int len = 3; len <= length; len++) {
            for (int i = 0, j; (j = i + len - 1) <= length - 1; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] && maxLength < len) {
                        longest = s.substring(i, j + 1);
                        maxLength = len;
                    }
                } else {
                    table[i][j] = false;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {

    }
}
