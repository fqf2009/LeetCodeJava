package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC0001_TwoSumTest {
    private LC0001_TwoSum solution;

    @BeforeEach
    void setup() {
        solution = new LC0001_TwoSum();
    }

    void twoSumTest(int[] nums, int target, int[] expected) {
        int[] res = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(expected, res);
    }

    @Test
    void twoSumTestCase1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        twoSumTest(nums, target, expected);
    }

    @Test
    void twoSumTestCase2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};
        twoSumTest(nums, target, expected);
    }

    @Test
    void twoSumTestCase3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};
        twoSumTest(nums, target, expected);
    }
}