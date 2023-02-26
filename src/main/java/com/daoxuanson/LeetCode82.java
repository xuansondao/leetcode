package com.daoxuanson;

import java.util.*;

public class LeetCode82 {
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
        Map<Integer, Integer> map = new HashMap<>();
        ListNode p = head;
        PriorityQueue<Map.Entry<Integer, Integer>> list = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());
        int count = 0;
        while (p != null) {
            if (map.containsKey(p.val)) {
                map.put(p.val, -1);
            } else {
                map.put(p.val, count++);
            }
            p = p.next;
        }
        ListNode rs = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() >= 0){
                list.offer(entry);
            }
        }

        while (!list.isEmpty()){
            if (rs == null){
                rs = new ListNode(list.poll().getKey());
            }else {
                ListNode node = new ListNode(list.poll().getKey());
                ListNode q = rs;
                while (q.next != null){
                    q = q.next;
                }
                q.next = node;
            }
        }


        return rs;
    }


    public static void main(String[] args) {
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(3, p1);
        ListNode p3 = new ListNode(0, p2);
        ListNode p4 = new ListNode(0, p3);
        ListNode p5 = new ListNode(-1, p4);
        ListNode p6 = new ListNode(-3, p5);
//        ListNode p6 = new ListNode(2, p5);
//        ListNode p7 = new ListNode(1, p6);
        ListNode p8 = new LeetCode82().deleteDuplicates(p6);
        while (p8 != null) {
            System.out.print(p8.val + " ");
            p8 = p8.next;
        }
    }
}
