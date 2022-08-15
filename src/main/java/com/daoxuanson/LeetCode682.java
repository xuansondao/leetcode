package com.daoxuanson;

import java.util.Stack;

public class LeetCode682 {

    public static boolean checkExpression(String i) {
        if (i.equals("+") || i.equals("C") || i.equals("D"))
            return true;

        return false;
    }

    public static int calPoints(String[] ops) {
        var stack  = new Stack<String>();
        for (var i = 0; i < ops.length; i++) {
           if (!checkExpression(ops[i])){
               stack.push(ops[i]);
           }else {
               if (ops[i].equals("+")){
                   var s1 = stack.peek();
                   stack.pop();
                   var s2 = stack.peek();
                   stack.push(s1);
                   var sum = Integer.parseInt(s1) + Integer.parseInt(s2);
                   stack.push("" + sum);
               }else if (ops[i].equals("C")){
                   stack.pop();
               }else if (ops[i].equals("D")){
                   var s1 = stack.peek();
                   var power = Integer.parseInt(s1)*2;
                   stack.push("" + power);
               }
           }
        }

        var sum = 0;
        while (!stack.isEmpty()){
            sum += Integer.parseInt(stack.pop());
        }

        return sum;
    }

    public static void main(String[] args) {
        var x = calPoints(new String[]{"1","C"});
        System.out.println(x);
    }
}
