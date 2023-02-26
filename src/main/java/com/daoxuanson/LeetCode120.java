package com.daoxuanson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int k = 2;
        for (int i = n - 2; i >= 0; i--, k++) {
            for (int j = m - k; j >= 0; j--) {
                triangle
                        .get(i)
                        .set(j,
                                triangle.get(i).get(j)
                                        + Math.min(
                                        triangle.get(i + 1).get(j)
                                        , triangle.get(i + 1).get(j + 1)
                                )
                        );

            }
        }

        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(6, 5, 7));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(4, 1, 8, 3));
        ls.add(l1);
        ls.add(l2);
        ls.add(l3);
        ls.add(l4);
        System.out.println(new LeetCode120().minimumTotal(ls));
    }
}
