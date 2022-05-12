package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0056_MergeIntervalsTest {
    private LC0056_MergeIntervals solution;

    @BeforeEach
    void setUp() {
        solution = new LC0056_MergeIntervals();
    }

    void mergeTest(int[][] intervals, int[][] expected) {
        int[][] output = solution.merge(intervals);
        assertArrayEquals(expected, output);
    }

    @Test
    void mergeTest1() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        mergeTest(intervals, expected);
    }

    @Test
    void mergeTest2() {
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};
        int[][] expected = new int[][]{{1, 5}};

        mergeTest(intervals, expected);
    }
}