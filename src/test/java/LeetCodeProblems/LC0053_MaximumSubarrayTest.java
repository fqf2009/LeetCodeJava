package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0053_MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        LC0053_MaximumSubarray sol = new LC0053_MaximumSubarray();
        assertEquals(6, sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, sol.maxSubArray(new int[]{1}));
        assertEquals(23, sol.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertEquals(-1, sol.maxSubArray(new int[]{-5, -4, -1, -7, -8}));
    }
}