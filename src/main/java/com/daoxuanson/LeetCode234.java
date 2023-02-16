package com.daoxuanson;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode234 {
    public static boolean isPalindrome(ListNode head) {
        var stack = new ArrayList<Integer>();
        ListNode p1 = head;
        while (p1 != null){
            stack.add(p1.val);
            p1 = p1.next;
        }
        var count = 0;
        var j = stack.size() -1;
        for (int i = 0; i < stack.size()/2; i++) {
            if (stack.get(i) == stack.get(j--)){
                count++;
            }
        }

        return count == stack.size()/2;
    }

    //Cách 2
    public boolean isPalindrome_2(ListNode head) {
        int len = 0;
        ListNode headNew = head;

        //  Tìm ra độ dài của danh sách
        while(headNew != null) {
            headNew = headNew.next;
            len++;
        }

        headNew = head;
        //con trỏ next
        ListNode next = null;
        //con trỏ prev
        ListNode prev = null;

        //  reverse first half and split list into two
        for(int i=0; i< len >> 1; ++i) {
            next = headNew.next;
            headNew.next = prev;
            prev = headNew;
            headNew = next;
        }

        //  cover case when list length is odd
        head = (len & 1) != 0 ? headNew.next : headNew;
        headNew = prev;

        //  check corresponding nodes of two lists
        for(int i=0; i < len >> 1; ++i) {
            if(head.val != headNew.val) return false;
            head = head.next;
            headNew = headNew.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode middle = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
//        head.next = node1;
//        node1.next = middle;
//        middle.next = node2;
//        node2.next = node3;
        System.out.println(isPalindrome(head));
        System.out.println(5 >> 1);

    }

}


class ListNode {
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

