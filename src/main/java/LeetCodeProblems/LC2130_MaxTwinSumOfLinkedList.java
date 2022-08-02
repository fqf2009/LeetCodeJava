package LeetCodeProblems;

import LeetCodeCommons.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LC2130_MaxTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int res = 0, n = list.size();
        for (int i = 0; i < n / 2; i++) {
            res = Integer.max(res, list.get(i) + list.get(n - 1 - i));
        }
        return res;
    }

    // reverse list
    public int pairSum1(ListNode head) {
        ListNode p1 = new ListNode(-1, head), p2 = p1;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode p3 = head, p4 = ListNode.reverse(p1.next);
        int res = 0;
        while (p4 != null) {
            res = Integer.max(res, p3.val + p4.val);
            p3 = p3.next;
            p4 = p4.next;
        }

        p1.next = ListNode.reverse(p1.next);
        return res;
    }
}
