package com.daoxuanson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] check = new boolean[1001];
        for (int i = 0; i < nums1.length; i++) {
            check[nums1[i]] = true;
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (check[nums2[i]] && !integers.contains(nums2[i])){
                integers.add(nums2[i]);
            }
        }

        int[] rs = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            rs[i] = integers.get(i);
        }

        return rs;
    }

    public static void main(String[] args) {

    }
}
