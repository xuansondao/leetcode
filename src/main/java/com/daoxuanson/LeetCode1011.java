package com.daoxuanson;

import java.util.Arrays;

public class LeetCode1011 {
    public int shipWithinDays(int[] a, int days) {
        int l = 0;
        int h = Arrays.stream(a).sum();
        while (l < h) {
            int m = l + (h-l)/2;
            if (isEnough(a, m, days)){
                h = m;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }


    public boolean isEnough(int[] a, int m, int d) {
        int count = 1;
        int sum = 0;
        for (int w : a) {
            if (w > m){
                return false;
            }
            if ((sum += w) > m) {

                if (++count > d){
                    return false;
                }
                sum = w;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1011().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));;
    }
}
