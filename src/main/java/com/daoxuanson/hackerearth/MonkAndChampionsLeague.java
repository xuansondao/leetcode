package com.daoxuanson.hackerearth;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MonkAndChampionsLeague {

    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[] a = new int[m];
        Comparator<Integer> t = (o1,o2) -> o2-o1;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(t);
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
            maxHeap.offer(a[i]);
        }

        Integer result = 0;

        for (int i = 0; i < n; i++) {
            int x = maxHeap.poll();
            result += x;
            maxHeap.offer(--x);
        }

        System.out.println(result);

    }
}
