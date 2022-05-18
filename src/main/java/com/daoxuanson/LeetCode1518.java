package com.daoxuanson;

public class LeetCode1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int temp = numBottles;
        int sum = numBottles;
        int surplus;
        do {
            surplus = temp / numExchange;
            sum = sum + surplus;
            temp = surplus + temp % numExchange;
        } while (surplus != 0);

        return sum;
    }

    public static void main(String[] args) {
        int t = numWaterBottles(15, 4);
        System.out.println(t);
    }
}
