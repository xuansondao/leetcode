package com.daoxuanson;

import java.util.*;

public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
       int[] a = new int[128];
       int l1 = s1.length();
       int l2 = s2.length();
       int count = l1;
        for (int i = 0; i < l1; i++) {
            a[s1.charAt(i)]++;
        }
        int start = 0, end = 0;
        while (end < l2){
            if (a[s2.charAt(end++)]-- > 0) count--;
            while (count == 0){
                if (end - start == l1) return true;
                if (++a[s2.charAt(start++)] > 0) count++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode567().checkInclusion("adc","dcda"));
    }
}
