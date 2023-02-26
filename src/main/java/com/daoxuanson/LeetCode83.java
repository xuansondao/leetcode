package com.daoxuanson;

public class LeetCode83 {
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return  null;
        ListNode node = null;
        ListNode p = head;
        node = new ListNode(p.val);
        while (p != null) {
            if (p.next != null && p.val != p.next.val) {
                ListNode n = new ListNode(p.next.val);
                ListNode q = node;
                while (q.next != null) {
                    q = q.next;
                }
                q.next = n;
            }
            p = p.next;
        }

        return node;
    }

    public static void main(String[] args) {
        ListNode p = new ListNode(3);
        ListNode p1 = new ListNode(2, p);
        ListNode p2 = new ListNode(2, p1);
        ListNode p3 = new ListNode(1,p2);
        ListNode p4 = new ListNode(1, p3);
//        ListNode p = new ListNode()

        ListNode q = new LeetCode83().deleteDuplicates(p4);
        while (q != null) {
            System.out.print(q.val + " ");
            q = q.next;
        }
    }
}
