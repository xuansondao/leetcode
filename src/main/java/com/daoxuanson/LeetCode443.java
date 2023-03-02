package com.daoxuanson;

import java.util.Stack;

public class LeetCode443 {
    public class Char {
        int index;
        char c;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Char)) return false;
            return c == (((Char) obj).c);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public int compress(char[] chars) {
        Stack<Integer> stack = new Stack<>();
        int k = 1;
        if (chars.length == 1) return 1;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i+1 < chars.length && chars[i] == chars[i + 1]) {
                if(stack.isEmpty()){
                    stack.push(k+1);
                }else {
                    k = stack.pop();
                    stack.push(k+1);
                }
            } else {
                k = 1;
                s.append(chars[i]);
                if (!stack.isEmpty()){
                    s.append(stack.pop());
                }
            }

        }

        if (!stack.isEmpty()){
            s.append(chars[chars.length-1]);
            s.append(stack.pop());
        }

        int j = 0;
        for (char c : s.toString().toCharArray()){
            chars[j++] = c;
        }

        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode443().compress(new char[]{'a', 'b','c'}));
    }
}
