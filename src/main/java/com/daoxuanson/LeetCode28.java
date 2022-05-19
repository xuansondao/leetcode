package com.daoxuanson;

public class LeetCode28 {
    public static int strStr(String haystack, String needle) {
//        if (haystack.length() < needle.length()) return -1;
//        char[] s1 = haystack.toCharArray();
//        char[] s2 = needle.toCharArray();
//        int n1 = s1.length;
//        int n2 = s2.length;
//        int count = 0;
//        int vt = -1;
//        int temp;
//        for (int i = 0; i < n1; i++) {
//            temp = i;
//            count = 0;
//            for (char c : s2) {
//                if (temp > n1 - 1) break;
//                if (s1[temp] == c) {
//                    temp++;
//                    count++;
//                }
//            }
//
//            if (count == n2) {
//                vt = i;
//                break;
//            }
//
//        }
//
//        return vt;

        int n = haystack.length();
        int m = needle.length();
        for(int i=0;i<=n-m;i++){
            String str = haystack.substring(i,i+m);
            if(str.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
