package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC0767_ReorganizeString {
    class Node implements Comparable<Node> {
        char ch;
        int freq;

        Node(char ch, int freq) {
            this.freq = freq;
            this.ch = ch;
        }

        @Override
        public int compareTo(Node other) {
            return other.freq - this.freq;  // order is reversed
        }
    }

    public String reorganizeString(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var entry : counter.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        Node prevNode = new Node(' ', 0);
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (prevNode.freq != 0) {
                pq.add(prevNode);
            }
            res.append(node.ch);
            node.freq -= 1;
            prevNode = node;
        }

        return prevNode.freq > 0 ? "" : res.toString();
    }
}
