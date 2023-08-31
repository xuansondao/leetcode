package com.daoxuanson;

public class LeetCode29 {
    public int divide(int dividend, int divisor) {

        if(divisor==-1 && dividend==Integer.MIN_VALUE){

            return Integer.MAX_VALUE;
        }

        return dividend/divisor;
    }
}
