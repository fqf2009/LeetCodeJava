package LeetCodeProblems;

import LeetCodeCommons.ListNode;

import java.util.*;

public class LC0023_MergeKSortedLists {
    private ListNode merge2Lists(ListNode n1, ListNode n2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                p.next = n1;
                n1 = n1.next;
            } else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }
        p.next = n1 != null ? n1 : n2;
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        List<ListNode> l1 = Arrays.asList(lists);

        while (l1.size() > 1) {
            List<ListNode> l2 = new ArrayList<>();
            for (int i = 0; i < l1.size(); i += 2) {
                if (i < l1.size() - 1) {
                    l2.add(merge2Lists(l1.get(i), l1.get(i + 1)));
                } else {
                    l2.add(l1.get(i));
                }
            }
            l1 = l2;
        }
        return l1.get(0);
    }

    public ListNode mergeKLists1(ListNode[] lists) {
        // Queue<ListNode> queue = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
        for (ListNode node : lists) {
            if (node != null)
                queue.add(node);
        }
        ListNode head = new ListNode();
        ListNode p = head;
        while (queue.size() > 0) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) {
                queue.add(p.next);
            }
        }
        return head.next;
    }
}
