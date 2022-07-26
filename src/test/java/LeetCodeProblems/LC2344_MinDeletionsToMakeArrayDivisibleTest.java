package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2344_MinDeletionsToMakeArrayDivisibleTest {
    LC2344_MinDeletionsToMakeArrayDivisible sol;

    @BeforeEach
    void setup() {
        sol = new LC2344_MinDeletionsToMakeArrayDivisible();
    }

    @Test
    void minOperations1() {
        int[] nums = {2, 3, 2, 4, 3};
        int[] numsDivide = {9, 6, 9, 3, 15};
        assertEquals(2, sol.minOperations(nums, numsDivide));
    }

    @Test
    void minOperations2() {
        int[] nums = {4, 3, 6};
        int[] numsDivide = {8, 2, 6, 10};
        assertEquals(-1, sol.minOperations(nums, numsDivide));
    }
}