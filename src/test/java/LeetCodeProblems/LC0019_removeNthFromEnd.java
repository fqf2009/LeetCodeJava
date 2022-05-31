package LeetCodeProblems;

import LeetCodeCommons.ListNode;

public class LC0019_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h0 = new ListNode(-1, head);
        ListNode p1 = h0, p2 = h0;
        for (int i = 0; i < n; i++) {
            p2 = p2.next;
        }
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;
        return h0.next;
    }
}
