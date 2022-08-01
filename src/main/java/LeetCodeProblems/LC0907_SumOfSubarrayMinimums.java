package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC0907_SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long res = 0, mod = 1000000007;
        // monotonic increasing stack to capture min value in sub-array
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i <= arr.length; i++) {
            int v = i == n ? Integer.MIN_VALUE : arr[i];
            while (!stk.isEmpty() && arr[stk.peekLast()] > v) {
                int j = stk.pollLast();
                int k = stk.isEmpty() ? -1 : stk.peekLast();
                // res = (res + arr[j] * (i - j) * (j - k)) % mod; // int overflow
                res = (res + ((long) arr[j]) * (i - j) * (j - k)) % mod;
            }
            stk.addLast(i);
        }

        return (int) res;
    }
}
