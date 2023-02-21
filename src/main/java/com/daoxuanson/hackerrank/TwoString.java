package com.daoxuanson.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoString {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Map<Character, Boolean> check = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            check.put(s1.charAt(i), true);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (check.containsKey(s2.charAt(i))){
                return "YES";
            }
        }

        return "NO";

    }

    public static void main(String[] args) {

    }
}
