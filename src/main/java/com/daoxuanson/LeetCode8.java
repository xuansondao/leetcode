package com.daoxuanson;

public class LeetCode8 {
    public static int myAtoi(String s) {
        if (s == null || s.length() < 1) return 0;
        if (s.length() == 1 && !(s.charAt(0) >= '0' && s.charAt(0) <= '9')) return 0;
        var rs = new StringBuilder();
        s = s.trim();
        var chars = s.toCharArray();

        if (!((chars[0] >= '0' && chars[0] <= '9') || chars[0] == '-' || chars[0] == '+')) return 0;

        for (var i = 0; i < chars.length; i++) {

            if ((chars[i] >= '0' && chars[i] <= '9') || chars[i] == '-') {
                if (chars[i] == '0' && rs.length() == 0) continue;
                rs.append((char) (chars[i]));
                if (i + 1 < chars.length - 1 && chars[i + 1] == '.') break;
                if (i + 1 < chars.length - 1 && chars[i] == '-' && chars[i + 1] == '+') return 0;
                if (i - 1 > -1 && chars[i - 1] == '+' && chars[i] == '-') return 0;
            }

        }

        if (rs.toString().contains("-") && rs.toString().charAt(0) != '-') return 0;
        if (rs.toString().contains("-") && rs.length() > 11) return Integer.MIN_VALUE;
        if (rs.length() > 10) return Integer.MAX_VALUE;
        if (rs.length() < 1) return 0;


        return Integer.parseInt(rs.toString());
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+-1"));
    }

}
