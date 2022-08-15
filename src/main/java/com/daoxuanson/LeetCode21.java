package com.daoxuanson;

public class LeetCode21 {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rs = new ListNode();
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1.next != null && p2.next != null) {



        }

        return rs;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        ListNode p4 = new ListNode(1);
        ListNode p5 = new ListNode(3);
        ListNode p6 = new ListNode(4);
        p4.next = p5;
        p5.next = p6;

        ListNode listNode = mergeTwoLists(p1, p4);
        ListNode head = listNode;
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
