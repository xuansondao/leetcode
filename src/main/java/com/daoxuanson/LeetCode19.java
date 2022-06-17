package com.daoxuanson;

public class LeetCode19 {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode start = head;
        for (; n > 0; n--)
            p1 = p1.next;
        if (p1 == null) return head.next;
        while (p1.next != null) {
            p1 = p1.next;
            start = start.next;
        }
        start.next = start.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        removeNthFromEnd(node1, 2);

    }
}
