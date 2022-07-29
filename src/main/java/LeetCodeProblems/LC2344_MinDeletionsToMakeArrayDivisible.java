package LeetCodeProblems;

import java.util.Arrays;

public class LC2344_MinDeletionsToMakeArrayDivisible {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        // reduce return Optional<Integer>
        int g = Arrays.stream(numsDivide).boxed().reduce(this::gcd).get();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
