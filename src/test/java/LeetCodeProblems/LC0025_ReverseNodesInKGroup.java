package LeetCodeProblems;

import LeetCodeCommons.ListNode;

public class LC0025_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode h0 = new ListNode(-1, head);
        ListNode p = h0;
        while (p.next != null) {
            ListNode tail = p.next;
            int n = reverseKNodes(p, k);
            if (n < k) {
                reverseKNodes(p, k);
                break;
            }
            p = tail;
        }
        return h0.next;
    }

    private int reverseKNodes(ListNode dummyHead, int k) {
        ListNode p = dummyHead.next, tail = dummyHead.next;
        ListNode head = null;
        int n = 0;
        while (p != null && n < k) {
            ListNode p1 = p.next;
            p.next = head;
            head = p;
            p = p1;
            n++;
        }
        dummyHead.next = head;
        tail.next = p;
        return n;
    }
}
