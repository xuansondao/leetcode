package com.daoxuanson;

public class LeetCode125 {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int size = s.length();
        char[] result = new char[size];
        char[] chars = s.toCharArray();
        int k = 0;
        for (int i = 0; i < size; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= '0' && chars[i] <= '9')) {
                result[k++] = chars[i];
            }
        }

        String m = new String(result);
        char[] results2 = new char[m.length()];
        k = 0;
        for (int i = m.length() - 1; i >= 0; i--) {
            results2[k++] = result[i];
        }

        String n = new String(results2);


        return m.trim().equals(n.trim());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
