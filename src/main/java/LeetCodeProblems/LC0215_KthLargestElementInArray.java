package LeetCodeProblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC0215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int v : nums) {
            if (queue.size() < k) {
                queue.add(v);
            } else if (v > queue.peek()) {
                queue.poll();
                queue.add(v);
            }
        }
        return queue.peek();
    }
}