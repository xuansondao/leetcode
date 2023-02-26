package com.daoxuanson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) return List.of(List.of(1));
        int[][] a = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            a[i] = new int[i + 1];
            a[i][0] = 1;
            if (i > 0) {
                a[i][i] = 1;
            }
        }


        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }


        return (List)Arrays.asList(a);
    }

    public static void main(String[] args) {
        new LeetCode118().generate(5);
    }
}
