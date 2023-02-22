package com.daoxuanson;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rev = 0;
        int temp =x;
        while (temp != 0) {
            int pop = temp % 10;
            temp /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return false;
            rev = rev * 10 + pop;
        }
        return x == rev;
    }

    public static void main(String[] args) {

    }
}
