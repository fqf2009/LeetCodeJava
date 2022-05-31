package LeetCodeProblems;

import LeetCodeCommons.ListNode;

public class LC0024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode h0 = new ListNode(-1, head);
        ListNode p = h0;
        while (p.next != null && p.next.next != null) {
            ListNode p1 = p.next, p2 = p.next.next;
            p.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            p = p1;
        }
        return h0.next;
    }
}
