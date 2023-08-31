package com.daoxuanson;

public class LeetCode50 {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1){
            return 1;
        }
        if(x == 0 || n == 1){
            return x;
        }
        if(n < 0){
            return 1/(myPow(x, -(n + 1))*x);
        }

        double result = 1.0;
        double contribution = x;
        while(n > 0){
            if(n % 2 == 1){
                result *= contribution;
            }
            contribution = contribution*contribution;
            n/= 2;
        }
        return result;
    }
}
