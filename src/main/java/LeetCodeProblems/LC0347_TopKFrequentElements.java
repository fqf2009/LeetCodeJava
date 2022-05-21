package LeetCodeProblems;

import java.util.*;

public class LC0347_TopKFrequentElements {
    // Bucket sort
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (var v : nums) {
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (var entry : counter.entrySet()) {
            int freq = entry.getValue(), v = entry.getKey();
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(v);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && res.size() < k; j++) {
                    res.add(bucket[i].get(j));
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (var v : nums) {
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (var val : counter.keySet()) {
            int freq = counter.get(val);
            if (queue.size() < k) {
                queue.add(new int[]{freq, val});
            } else {
                if (queue.peek()[0] < freq) {
                    queue.poll();
                    queue.add(new int[]{freq, val});
                }
            }
        }
        return queue.stream().mapToInt(a -> a[1]).toArray();
    }
}
