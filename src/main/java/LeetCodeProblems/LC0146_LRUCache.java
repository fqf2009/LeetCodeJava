package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC0146_LRUCache {
    private static class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LC0146_LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    private void add_node(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void remove_node(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.prev = node.next = null;
    }

    private void move_to_head(Node node) {
        remove_node(node);
        add_node(node);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            move_to_head(node);
            return node.val;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            move_to_head(node);
        } else {
            if (map.size() >= capacity) {
                Node node = tail.prev;
                map.remove(node.key);
                remove_node(node);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            add_node(node);
        }
    }
}
