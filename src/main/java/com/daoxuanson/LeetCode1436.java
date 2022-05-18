package com.daoxuanson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1436 {
    public static String destCity(List<List<String>> paths) {
        Map<String, Integer> outdegree = new HashMap<>();

        for (List<String> edge : paths) {
            String u = edge.get(0);
            String v = edge.get(1);

            outdegree.putIfAbsent(u, 0);
            outdegree.putIfAbsent(v, 0);

            outdegree.put(u, outdegree.get(u) + 1);
        }

        for (String city : outdegree.keySet()) {
            if (outdegree.get(city) == 0) return city;
        }

        return "";
    }

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(List.of("B", "C"));
        lists.add(List.of("D", "B"));
        lists.add(List.of("C", "A"));
        System.out.println(destCity(lists));
    }
}
