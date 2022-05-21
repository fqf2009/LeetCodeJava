package LeetCodeProblems;

public class LC0138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // duplicate in place
        Node p = head;
        while (p != null) {
            Node p1 = new Node(p.val);
            p1.next = p.next;
            p.next = p1;
            p = p1.next;
        }

        // set random pointer
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }

        // separate two lists (detach new list)
        Node h1 = head.next, p1 = head.next;
        p = head;
        while (p != null) {
            p.next = p1.next;
            p = p.next;
            if (p != null) {
                p1.next = p.next;
                p1 = p1.next;
            }
        }

        return h1;
    }
}

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}