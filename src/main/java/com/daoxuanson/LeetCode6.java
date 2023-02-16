package com.daoxuanson;


//https://leetcode.com/problems/zigzag-conversion/description/
public class LeetCode6 {
    public static String convert(String s, int numRows) {
        int N = s.length();
        if (numRows == 1) {
            return s;
        }

        StringBuilder res = new StringBuilder();
        int factor = (2 * numRows) - 2;
        int row = 0;
        while (row < numRows) {
            for (int i = row; i < N; i += factor) {
                res.append(s.charAt(i));

                if (row != 0 && row != numRows - 1 && i + factor - (2 * row) < N) {
                    char ch = s.charAt(i + factor - (2 * row));
                    res.append(ch);
                }
            }

            row++;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
