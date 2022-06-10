package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0057_InsertIntervalTest {
    LC0057_InsertInterval sol;

    @BeforeEach
    void setUp() {
        sol = new LC0057_InsertInterval();
    }

    void insertTest(int[][] intervals, int[] newInterval, int[][] expected) {
        int[][] output = sol.insert(intervals, newInterval);
        assertArrayEquals(expected, output);
    }

    @Test
    void insert1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        insertTest(intervals, newInterval, expected);
    }

    @Test
    void insert2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        insertTest(intervals, newInterval, expected);
    }

    @Test
    void insert3() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] expected = {{5, 7}};
        insertTest(intervals, newInterval, expected);
    }
}