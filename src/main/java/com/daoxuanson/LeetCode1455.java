package com.daoxuanson;

public class LeetCode1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        int n = searchWord.length();

        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (word.length() < n) continue;
            String wordT = word.substring(0, n);
            if (wordT.equals(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i am tired", "am"));
    }
}
