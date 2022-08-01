package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC2104_SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        long res = 0, n = nums.length;
        Deque<Integer> stk = new ArrayDeque<>();

        // monotonic decreasing stack to max value in sub-array
        for (int i = 0; i <= nums.length; i++) {
            long v = i == n ? Long.MAX_VALUE : nums[i];
            while (!stk.isEmpty() && nums[stk.peekLast()] < v) {
                int j = stk.pollLast();
                int k = stk.isEmpty() ? -1 : stk.peekLast();
                res += (long) nums[j] * (i - j) * (j - k);
            }
            stk.addLast(i);
        }

        // monotonic increasing stack to min value in sub-array
        stk.clear();
        for (int i = 0; i <= nums.length; i++) {
            long v = i == n ? Long.MIN_VALUE : nums[i];
            while (!stk.isEmpty() && nums[stk.peekLast()] > v) {
                int j = stk.pollLast();
                int k = stk.isEmpty() ? -1 : stk.peekLast();
                res -= (long) nums[j] * (i - j) * (j - k);
            }
            stk.addLast(i);
        }

        return res;
    }
}
