package com.daoxuanson;

import java.util.Arrays;

public class LeetCode344 {
    public void swap(char a[], int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void reverseString(char[] s) {
        int j = s.length - 1;
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            swap(s, i, j--);
        }

        System.out.println(new String(s));
    }


    public static void main(String[] args) {
        new LeetCode344().reverseString(new char[]{'h','e','l','l','o'});
    }
}
