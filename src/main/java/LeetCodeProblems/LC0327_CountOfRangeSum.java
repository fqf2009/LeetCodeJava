package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC0327_CountOfRangeSum {
    private int bisectLeft(long[] nums, int fromIndex, int toIndex, long key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) / 2;
            if (nums[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid;
            }
        }
        return fromIndex;
    }

    private int bisectRight(long[] nums, int fromIndex, int toIndex, long key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) / 2;
            if (nums[mid] <= key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid;
            }
        }
        return fromIndex;
    }

    // Time Limit Exceeded
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            int left = bisectLeft(prefix, 0, i, prefix[i] - upper);
            int right = bisectRight(prefix, 0, i, prefix[i] - lower);
            res += right - left;
            Arrays.sort(prefix, 0, i + 1);
        }

        return res;
    }

    public int countRangeSum1(int[] nums, int lower, int upper) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long[] sortedPrefix = Arrays.copyOf(prefix, prefix.length);
        Arrays.sort(sortedPrefix);
        Map<Long, Integer> ranks = new HashMap<>();
        for (int i = 0; i < sortedPrefix.length; i++) {
            ranks.put(sortedPrefix[i], i + 1);
        }

        int res = 0;
        FenwickTree ft = new FenwickTree(prefix.length);
        for (var ps : prefix) {
            res += ft.sum(bisectRight(sortedPrefix, 0, sortedPrefix.length, ps - lower))
                    - ft.sum(bisectLeft(sortedPrefix, 0, sortedPrefix.length, ps - upper));
            ft.increment(ranks.get(ps));
        }
        return res;
    }
}

// Binary Index Tree
class FenwickTree {
    private int[] bitArr;

    public FenwickTree(int n) {
        bitArr = new int[n + 1];
    }

    public int sum(int idx) {
        int res = 0;
        while (idx > 0) {
            res += this.bitArr[idx];
            idx -= idx & -idx;
        }
        return res;
    }

    public void increment(int idx) {
        while (idx < this.bitArr.length) {
            this.bitArr[idx] += 1;
            idx += idx & -idx;
        }
    }
}
