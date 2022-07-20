package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0327_CountOfRangeSumTest {
    private LC0327_CountOfRangeSum sol;

    @BeforeEach
    void setup() {
        sol = new LC0327_CountOfRangeSum();
    }

    void testCountRangeSum(int[] nums, int lower, int upper, int expected) {
        int r = sol.countRangeSum(nums, lower, upper);
        assertEquals(expected, r);

        int r1 = sol.countRangeSum1(nums, lower, upper);
        assertEquals(expected, r1);
    }

    @Test
    void countRangeSum1() {
        int[] nums = {2147483647, -2147483648, -1, 0};
        testCountRangeSum(nums, -1, 0, 4);
    }

    @Test
    void countRangeSum2() {
        int[] nums = {-2, 5, -1};
        testCountRangeSum(nums, -2, 2, 3);
    }

    @Test
    void countRangeSum3() {
        int[] nums = {0};
        testCountRangeSum(nums, 0, 0, 1);
    }
}