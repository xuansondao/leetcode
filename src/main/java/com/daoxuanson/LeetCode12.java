package com.daoxuanson;

//https://leetcode.com/problems/integer-to-roman/

public class LeetCode12 {
    public static String intToRoman(int num) {
        return new StringBuilder().append(convertThoundsandToRoman(num / 1000))
                .append(convertTramToRoman((num / 100) % 10))
                .append(convertChucToRoman((num / 10) % 10))
                .append(convertDonViToRoman(num % 10)).toString();
    }

    public static String convertDonViToRoman(int num) {
        if (num < 4) {
            StringBuilder rs = new StringBuilder();
            while (num-- > 0) {
                rs.append("I");
            }

            return rs.toString();
        } else if (num == 4) return "IV";
        else if (num == 5) return "V";
        else if (num == 9) return "IX";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            rs.append("V");
            while (num-- > 0) {
                rs.append("I");
            }
            return rs.toString();
        }
    }

    public static String convertChucToRoman(int num) {
        if (num < 4){
            StringBuilder rs = new StringBuilder();
            while (num-- > 0) {
                rs.append("X");
            }
            return rs.toString();
        }
        else if (num == 4) return "XL";
        else if (num == 5) return "L";
        else if (num == 9) return "XC";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            rs.append("L");
            while (num-- > 0) {
                rs.append("X");
            }
            return rs.toString();
        }
    }

    public static String convertTramToRoman(int num){
        if (num < 4){
            StringBuilder rs = new StringBuilder();
            while (num-- > 0) {
                rs.append("C");
            }
            return rs.toString();
        }
        else if (num == 4) return "CD";
        else if (num == 5) return "D";
        else if (num == 9) return "CM";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            rs.append("D");
            while (num-- > 0) {
                rs.append("C");
            }
            return rs.toString();
        }
    }

    public static String convertThoundsandToRoman(int num) {
        StringBuilder rs = new StringBuilder();
        while (num-- > 0) {
            rs.append("M");
        }

        return rs.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
}
