package com.daoxuanson;

public class LeetCode2095 {
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


    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p2 == null) break;
        }

        p2 = head;
        while (p2 != null) {
            if (p2.next != null && p2.next == p1) {
                p2.next = p1.next;
                p1 = null;
                break;
            }
            p2 = p2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode p5 = new ListNode(5);
        ListNode p4 = new ListNode(4,p5);
        ListNode p3 = new ListNode(3, p4);
        ListNode p2 = new ListNode(2, p3);
        ListNode p1 = new ListNode(1, p2);
        ListNode p = new LeetCode2095().deleteMiddle(p1);
        ListNode head = p;
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
