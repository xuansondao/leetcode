package com.daoxuanson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode17 {
    public static List<String> letterCombinations(String digits) {
        var map = new HashMap<String, List<String>>();
        map.put("2", List.of("a", "b", "c"));
        map.put("3", List.of("d", "e", "f"));
        map.put("4", List.of("g", "h", "i"));
        map.put("5", List.of("j", "k", "l"));
        map.put("6", List.of("m", "n", "o"));
        map.put("7", List.of("a", "b", "c"));
        map.put("8", List.of("a", "b", "c"));
        map.put("9", List.of("a", "b", "c"));
        if (digits.length() == 1) {
            return map.get(digits);
        }
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            list.add(map.get(digits.charAt(i) + ""));
        }
        List<String> rs = new ArrayList<>();
        int index = 0;
        List<String> temp = new ArrayList<>();
        temp.addAll(list.get(0))
        for (int i = 1; i < list.size(); i++) {
            List<String> listString = list.get(i);
            for (int j = 0; j < temp.size(); j++) {
                for (int l = 0; l < listString.size(); l++) {
                    rs.add(index, temp.get(0) + listString.get(l));
                    index++;
                }
            }
            temp.addAll(rs);
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

