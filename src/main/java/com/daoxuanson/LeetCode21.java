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
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode rs = null;
        while (p1 != null && p2 != null) {
            if (p1.val >= p2.val) {
                rs = add(rs, p2.val);
                p2 = p2.next;
            } else if (p1.val < p2.val) {
                rs = add(rs, p1.val);
                p1 = p1.next;
            }
        }
        if (p2 != null){
            while (p2 != null){
                rs = add(rs, p2.val);
                p2 = p2.next;
            }
        }
        if (p1 != null){
            while (p1 != null){
                rs = add(rs, p1.val);
                p1 = p1.next;
            }
        }

        return rs;
    }

    public static ListNode add(ListNode root, int val) {
        if (root == null) {
            root = new ListNode(val);
            return root;
        }

        ListNode node = new ListNode(val);
        ListNode p1  = root;
        while (p1.next != null){
            p1 = p1.next;
        }
        p1.next = node;


        return root;
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
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
