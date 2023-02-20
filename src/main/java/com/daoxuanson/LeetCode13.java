package com.daoxuanson;

public class LeetCode13 {
    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'M') {
                result += 1000;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 < length && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i++;
                } else if (i + 1 < length && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i++;
                } else {
                    result += 100;
                }
            } else if (s.charAt(i) == 'D') {
                result += 500;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 < length && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i++;
                } else if (i + 1 < length && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i++;
                } else {
                    result += 10;
                }
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'I') {
                if (i + 1 < length && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i++;
                } else if (i + 1 < length && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i++;
                } else {
                    result += 1;
                }
            } else if (s.charAt(i) == 'V') {
                result += 5;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
