package com.daoxuanson;

public class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, cur = dummy, nex = dummy;
        int count = 0;

        while(cur.next != null){
            count++;
            cur = cur.next;
        }

        while(count >= k){
            cur = pre.next;
            nex = cur.next;
            for(int i=1; i < k; i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            count -= k;
        }
        return dummy.next;
    }
}
