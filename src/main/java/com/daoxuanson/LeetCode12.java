package com.daoxuanson;

//https://leetcode.com/problems/integer-to-roman/

public class LeetCode12 {
    public static String intToRoman(int num) {
       StringBuilder rs = new StringBuilder();
       int number;
       int dem = 1;
       while (num != 0){
            number = num % 10;
            num /= 10;
            if(dem == 1){
                rs.append(convertDonViToRoman(number));
            }else if(dem == 2){
                rs.append(convertChucToRoman(number));
            }else if (dem == 3){
                rs.append(convertTramToRoman(number));
            }else {
                while (number-- > 0){
                    rs.append("M");
                }
            }
            dem++;
       }


       return rs.reverse().toString();
    }

    public static String convertDonViToRoman(int num) {
        if (num < 4) {
            StringBuilder rs = new StringBuilder();
            while (num-- > 0) {
                rs.append("I");
            }

            return rs.toString();
        } else if (num == 4) return "VI";
        else if (num == 5) return "V";
        else if (num == 9) return "XI";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            while (num-- > 0) {
                rs.append("I");
            }
            rs.append("V");
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
        else if (num == 4) return "LX";
        else if (num == 5) return "L";
        else if (num == 9) return "CX";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            while (num-- > 0) {
                rs.append("X");
            }
            rs.append("L");
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
        else if (num == 4) return "DC";
        else if (num == 5) return "D";
        else if (num == 9) return "MC";
        else {
            StringBuilder rs = new StringBuilder();
            num = num - 5;
            while (num-- > 0) {
                rs.append("C");
            }
            rs.append("D");
            return rs.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
