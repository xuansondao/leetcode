package com.daoxuanson;

public class LeetCode1491 {
    public static double average(int[] salary) {
        double sum = 0;
        int min = salary[0];
        int max = salary[0];
        int n = salary.length;
        for (int i = 0; i < n; i++) {
            sum += salary[i];
            if (salary[i] < min) min = salary[i];
            if (salary[i] > max) max = salary[i];
        }

        return (sum - min - max) / (n - 2);
    }

    public static void main(String[] args) {
        int[] a = new int[]{4000, 3000, 1000, 2000};
        System.out.println(average(a));
    }
}
