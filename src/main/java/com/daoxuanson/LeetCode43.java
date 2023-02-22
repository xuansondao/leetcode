package com.daoxuanson;

import java.math.BigInteger;

public class LeetCode43 {
    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        return n1.multiply(n2).toString();
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode43().multiply("123","456"));
    }
}
