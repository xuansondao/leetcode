package com.daoxuanson;

import java.math.BigInteger;

public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        BigInteger middle;
        while (left <= right){
            middle = new BigInteger(String.valueOf(left + (right - left)/2));
            if (middle.multiply(middle).compareTo(new BigInteger(String.valueOf(num))) < 0 ){
                left = middle.intValue() + 1;
            } else if ((middle.multiply(middle).compareTo(new BigInteger(String.valueOf(num)))) > 0) {
                right = middle.intValue() -1;
            }else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode367().isPerfectSquare(2147483647));
    }

}
