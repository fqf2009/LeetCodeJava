package LeetCodeProblems;

import LeetCodeCommons.ListNode;

public class LC0002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head, p;
        head = p = new ListNode();

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            p.next = new ListNode(carry % 10);
            p = p.next;
            carry /= 10;
        }

        return head.next;
    }
}
