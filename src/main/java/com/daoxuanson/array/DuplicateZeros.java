package com.daoxuanson.array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                if (i+1 < arr.length){
                    arr[i + 1] = 0;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 0, 0, 0, 0, 0, 0};
        duplicateZeros(a);
        Arrays.stream(a).forEach(System.out::println);
    }

}
