package com.daoxuanson;

public class LeetCode1422 {
    public static int maxScore(String s) {
        int numOfOne = 0;
        int numOfZero = s.charAt(0) == '0' ? 1 : 0;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                numOfOne++;
            }
        }
        int sum = numOfOne + numOfZero;
        for(int i = 1; i<s.length(); i++){
            sum = Math.max(sum, numOfOne+numOfZero);
            if(s.charAt(i) == '1'){
                numOfOne--;
            }else{
                numOfZero++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
