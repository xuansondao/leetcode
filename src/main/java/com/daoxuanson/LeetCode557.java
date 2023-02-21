package com.daoxuanson;

public class LeetCode557 {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder rs = new StringBuilder();
        for (String s1 : array) {
            rs.append(reverseString(s1.toCharArray())).append(" ");
        }


        return rs.toString().trim();
    }

    public void swap(char a[], int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public String reverseString(char[] s) {
        int j = s.length - 1;
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            swap(s, i, j--);
        }

        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode557().reverseWords("Let's take LeetCode contest"));
    }
}
