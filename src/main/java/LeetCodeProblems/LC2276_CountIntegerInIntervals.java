package LeetCodeProblems;

import java.util.NavigableMap;
import java.util.TreeMap;

public class LC2276_CountIntegerInIntervals {
    private final NavigableMap<Integer, Integer> map = new TreeMap<>();
    private int cnt = 0;

    public void add(int left, int right) {
        if (map.size() > 0) {
            var entry = map.lowerEntry(left);
            if (entry != null && entry.getValue() >= left - 1) {
                int lo = entry.getKey(), hi = entry.getValue();
                cnt -= hi - lo + 1;
                left = entry.getKey();
                right = Integer.max(right, entry.getValue());
                map.remove(lo);
            }

            while (true) {
                entry = map.ceilingEntry(left);
                if (entry == null || entry.getKey() > right + 1) break;
                int lo = entry.getKey(), hi = entry.getValue();
                cnt -= hi - lo + 1;
                right = Integer.max(right, hi);
                map.remove(lo);
            }
        }

        map.put(left, right);
        cnt += right - left + 1;
    }

    public int count() {
        return cnt;
    }
}
