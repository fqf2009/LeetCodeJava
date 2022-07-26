package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class LC2354_NumberOfExcellentPairs {
    public long countExcellentPairs(int[] nums, int k) {
        final int MAX_BITS = 32;
        // Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
            set.add(v);
        }

        long[] bits = new long[MAX_BITS];
        set.forEach(v -> bits[Integer.bitCount(v)]++);

        long res = 0;
        for (int i = 0; i < MAX_BITS; i++) {
            for (int j = 0; j < MAX_BITS; j++) {
                if (i + j >= k) {
                    res += bits[i] * bits[j];
                }
            }
        }
        return res;
    }
}
