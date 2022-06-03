package LeetCodeProblems;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Deque;

public class LC0362_DesignHitCounter {
    /**
     * Your HitCounter object will be instantiated and called as such:
     * HitCounter obj = new HitCounter();
     * obj.hit(timestamp);
     * int param_2 = obj.getHits(timestamp);
     */

    private final Deque<SimpleEntry<Integer, Integer>> hitQueue;
    private int hits;

    public LC0362_DesignHitCounter() {
        hitQueue = new ArrayDeque<>();
        hits = 0;
    }

    public void hit(int timestamp) {
        getHits(timestamp);     // cleanup a little
        if (hitQueue.size() > 0) {
            SimpleEntry<Integer, Integer> ent = hitQueue.peekLast();
            if (ent.getKey() == timestamp)
                ent.setValue(ent.getValue() + 1);
            else
                hitQueue.addLast(new SimpleEntry<>(timestamp, 1));
        } else {
            hitQueue.addLast(new SimpleEntry<>(timestamp, 1));
        }
        hits++;
    }

    public int getHits(int timestamp) {
        while (hitQueue.size() > 0) {
            SimpleEntry<Integer, Integer> ent = hitQueue.peekFirst();
            if (ent.getKey() <= timestamp - 300) {
                hits -= ent.getValue();
                hitQueue.removeFirst();
            } else {
                break;
            }
        }
        return hits;
    }
}

