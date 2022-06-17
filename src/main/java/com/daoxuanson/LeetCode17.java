package com.daoxuanson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
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
        List<String> rs = new ArrayList<>();

        return rs;
    }
}

