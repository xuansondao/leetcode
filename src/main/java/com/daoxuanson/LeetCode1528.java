package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1528 {
    public static String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int length = indices.length;
        for (int i = 0; i < length; ++i) {
            map.put(indices[i], chars[i]);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            result.append(map.get(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] a = new int[]{
                4, 5, 6, 7, 0, 2, 1, 3
        };
        System.out.println(restoreString("codeleet", a));
    }
}
