package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1507 {
    public static String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<>(){
           
        };
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        if (date.length() == 12) date = "0" + date;

        String day = date.substring(0, 2);
        String month = monthMap.get(date.substring(5, 8));
        String year = date.substring(9);

        return year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        System.out.println(reformatDate("6th Jun 1933"));
    }
}
