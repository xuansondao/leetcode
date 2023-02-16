package com.daoxuanson;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class LeetCode8 {
    public static int myAtoi(String s) {
        long ans = 0;
        boolean pos = false;
        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (pos || neg)
                    return 0;
                continue;
            }
            if (s.charAt(i) == '-') {
                if (neg || pos) return 0;
                neg = true;
            } else if (s.charAt(i) == '+') {
                if (pos || neg) return 0;
                pos = true;
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) == '.' || s.charAt(i) == '_') {
                return 0;
            } else {
                int j = i;
                if (neg) {
                    while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                        ans = (ans * 10) + s.charAt(j) - '0';
                        if ((ans * -1) < Integer.MIN_VALUE)
                            return Integer.MIN_VALUE;
                        j++;
                    }
                    return -1 * (int) ans;
                } else {
                    while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                        ans = (ans * 10) + s.charAt(j) - '0';
                        if (ans > Integer.MAX_VALUE)
                            return Integer.MAX_VALUE;
                        j++;
                    }
                    return (int) ans;
                }
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }
}
