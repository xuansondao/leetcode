package com.daoxuanson;

public class LeetCode374 {
    public int guessNumber(int n) {
        int left = 0 ;
        int right = n;
        int middle;
        while (left <= right){
            middle = left + (right - left)/2;
            if (guess(middle) == -1){
                right = middle - 1;
            } else if (guess(middle) == 1) {
                left = middle + 1;
            }else {
                return middle;
            }
        }

        return -1;
    }

    public int guess(int number){
        return 0;
    }

    public static void main(String[] args) {

    }



}
