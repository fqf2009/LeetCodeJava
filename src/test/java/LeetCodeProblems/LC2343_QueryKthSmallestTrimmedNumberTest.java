package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2343_QueryKthSmallestTrimmedNumberTest {
    LC2343_QueryKthSmallestTrimmedNumber sol;

    @BeforeEach
    void setUp() {
        sol = new LC2343_QueryKthSmallestTrimmedNumber();
    }

    void smallestTrimmedNumbersTest(String[] nums, int[][] queries, int[] expected) {
        assertArrayEquals(expected, sol.smallestTrimmedNumbers(nums, queries));
        assertArrayEquals(expected, sol.smallestTrimmedNumbers1(nums, queries));
    }

    @Test
    void smallestTrimmedNumbers1() {
        String[] nums = {"102", "473", "251", "814"};
        int[][] queries = {{1, 1}, {2, 3}, {4, 2}, {1, 2}};
        int[] expected = {2, 2, 1, 0};
        smallestTrimmedNumbersTest(nums, queries, expected);
    }

    @Test
    void smallestTrimmedNumbers2() {
        String[] nums = {"24", "37", "96", "04"};
        int[][] queries = {{2, 1}, {2, 2}};
        int[] expected = {3, 0};
        smallestTrimmedNumbersTest(nums, queries, expected);
    }
}