package com.daoxuanson;

import java.util.Arrays;

public class LeetCode70 {
    public int climbStairs(int n) {
        if(n < 2) return 1;
        int step0=1;
        int step1=1;
        int rs = 0;
        for(int i = 2; i <= n; ++i){
            rs = step0 + step1;
            step1 = step0;
            step0 = rs;
        }

        return rs;
    }
}
