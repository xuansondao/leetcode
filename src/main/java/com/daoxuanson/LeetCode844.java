package com.daoxuanson;

import java.util.Stack;

public class LeetCode844 {

    public static String toString(String s){
        var stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder rs = new StringBuilder();
        while (!stack.isEmpty()){
            rs.append(stack.pop());
        }

        return rs.toString();
    }

    public static boolean backspaceCompare(String s, String t) {
       String rs1 = toString(s);
       String rs2 = toString(t);

       return rs1.equals(rs2);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("","#"));
    }
}
