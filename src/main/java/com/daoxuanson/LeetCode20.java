package com.daoxuanson;

import java.util.Stack;

public class LeetCode20 {
    public static boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else {
                if (!stack.isEmpty()){
                    if (stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
                    else if (stack.peek() == '[' && s.charAt(i) == ']') stack.pop();
                    else if (stack.peek() == '{' && s.charAt(i) == '}') stack.pop();
                    else return false;
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
