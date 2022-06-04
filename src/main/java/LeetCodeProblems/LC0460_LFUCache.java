package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

// doubly linked node
class DLNode {
    int key, val, freq;
    DLNode prev, next;

    public DLNode(int key, int val, int freq) {
        this.key = key;
        this.val = val;
        this.freq = freq;
        this.prev = this;
        this.next = this;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LC0460_LFUCache {
    private final int capacity;
    private int minFreq;
    private final Map<Integer, DLNode> nodes;
    private final Map<Integer, DLNode> freqList;

    public LC0460_LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        nodes = new HashMap<>();
        freqList = new HashMap<>();
    }

    private void add(DLNode node) {
        DLNode head;
        if (!freqList.containsKey(node.freq)) {
            head = new DLNode(-1, -1, node.freq);
            freqList.put(node.freq, head);
        } else {
            head = freqList.get(node.freq);
        }
        node.prev = head;
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
    }

    private void remove(DLNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        if (minFreq == node.freq && isEmptyFreq(node.freq))
            minFreq++;
    }

    private boolean isEmptyFreq(int freq) {
        return (!freqList.containsKey(freq)) ||
                freqList.get(freq).next == freqList.get(freq);
    }

    public int get(int key) {
        if (!nodes.containsKey(key)) return -1;
        DLNode node = nodes.get(key);
        remove(node);
        node.freq++;
        add(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        if (nodes.containsKey(key)) {
            DLNode node = nodes.get(key);
            remove(node);
            node.val = value;
            node.freq++;
            add(node);
        } else {
            if (nodes.size() >= capacity) {
                DLNode lfu = freqList.get(minFreq).prev;
                remove(lfu);
                nodes.remove(lfu.key);
            }
            DLNode node = new DLNode(key, value, 1);
            nodes.put(key, node);
            minFreq = 1;
            add(node);
        }
    }
}

