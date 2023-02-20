package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1528 {
    public static String restoreString(String s, int[] indices) {

        int length=s.length();
        StringBuilder sb=new StringBuilder("");
        char c[]=new char[length];

        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);

        }
        sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = new int[]{
                4, 5, 6, 7, 0, 2, 1, 3
        };
        System.out.println(restoreString("codeleet", a));
    }
}
