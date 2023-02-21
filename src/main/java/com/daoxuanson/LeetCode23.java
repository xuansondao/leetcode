package com.daoxuanson;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode23 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(comparator);
        ListNode p = null;
        for (int i = 0; i < lists.length; i++) {
            p = lists[i];
            while (p != null){
                maxHeap.offer(p.val);
                p = p .next;
            }
            p = null;
        }

        ListNode root = null;

       while (!maxHeap.isEmpty()){
            root = add(root, maxHeap.poll());
        }

        return root;
    }



    public static ListNode add(ListNode root, int val) {
        if (root == null) {
            root = new ListNode(val);
            return root;
        }

        ListNode node = new ListNode(val);
        ListNode p1 = root;
        while (p1.next != null) {
            p1 = p1.next;
        }
        p1.next = node;


        return root;
    }

    public static void main(String[] args) {
        ListNode p3 = new ListNode(5);
        ListNode p2 = new ListNode(4, p3);
        ListNode p1 = new ListNode(1, p2);

        ListNode p6 = new ListNode(4);
        ListNode p5 = new ListNode(3, p6);
        ListNode p4 = new ListNode(1, p5);

        ListNode p8 = new ListNode(6);
        ListNode p7 = new ListNode(2, p8);
        ListNode p = mergeKLists(new ListNode[]{p1, p4, p7});
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
