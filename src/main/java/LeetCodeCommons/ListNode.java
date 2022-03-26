package LeetCodeCommons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Definition for singly-linked list.
public class ListNode implements Iterable<Integer> {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode getNode(){
        return this;
    }

    public static ListNode createNodeList(Iterable<Integer> iter) {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int v : iter) {
            p.next = new ListNode(v);
            p = p.next;
        }
        return head.next;
    }

    public static List<Integer> nodeListToList(ListNode head) {
        var arr = new ArrayList<Integer>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        return arr;
    }

    @Override
    public String toString(){
        return nodeListToList(this).toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private ListNode current = getNode();

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                var value = current.val;
                current = current.next;
                return value;
            }
        };
    }
}
