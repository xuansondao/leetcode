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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rs = new ListNode();
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return rs;
    }
}
