package LeetCodeProblems;

import LeetCodeCommons.ListNode;

class LC0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head, p;
        head = p = new ListNode();
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = list1 != null ? list1 : list2;
        return head.next;
    }
}
