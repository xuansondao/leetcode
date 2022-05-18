package com.daoxuanson;

public class LeetCode1446 {
    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
                if (s.length() == 2) {
                    max = count;
                }
                if (i + 1 == s.length() - 1 && count > max) {
                    max = count;
                }
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        return max + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"));
    }
}
