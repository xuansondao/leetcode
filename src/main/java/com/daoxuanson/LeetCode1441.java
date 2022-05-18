package com.daoxuanson;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1441 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        int i = 0;
        int a = 1;
        while (i < target.length) {
            if (target[i] == a) {
                l.add("Push");
            }
            if (target[i] != a) {
                l.add("Push");
                l.add("Pop");
                i--;
            }
            i++;
            a++;
        }
        return l;
    }

    public static void main(String[] args) {
        buildArray(new int[]{1, 3}, 3).forEach(System.out::println);
    }
}
