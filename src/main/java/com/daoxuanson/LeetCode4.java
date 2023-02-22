package com.daoxuanson;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        if (m > n) {
            int[] temp = a;
            a = b;
            b = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int min = 0, max = m, halfLen = (m + n + 1) / 2;
        while (min <= max) {
            int i = (min + max) / 2;
            int j = halfLen - i;
            if (i < max && b[j - 1] > a[i]) {
                min = i + 1;
            } else if (i > min && a[i - 1] > b[j]) {
                max = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = b[j - 1];
                } else if (j == 0) {
                    maxLeft = a[i - 1];
                } else {
                    maxLeft = Math.max(a[i - 1], b[j - 1]);
                }
                if (((m + n) & 1)== 0) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = b[j];
                } else if (j == n) {
                    minRight = a[i];
                } else {
                    minRight = Math.min(b[j], a[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {

    }
}
