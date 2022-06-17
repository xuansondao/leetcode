package com.daoxuanson;

public class LeetCode278 {
    public static int firstBadVersion(int n, int bad) {
        int left = 0;
        int right = n;
        int middle;
        int rs = -1;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (bad == middle) {
                rs = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5,4));
    }

}
