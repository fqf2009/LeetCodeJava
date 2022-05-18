package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0015_ThreeSumTest {
    private LC0015_ThreeSum sol;

    @BeforeEach
    void setUp() {
        sol = new LC0015_ThreeSum();
    }

    @Test
    void threeSum1() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        assertIterableEquals(expected, sol.threeSum(input));
        assertIterableEquals(expected, sol.threeSum1(input));
    }

    @Test
    void threeSum2() {
        int[] input = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        List<List<Integer>> expected = List.of(
                List.of(-4, -2, 6), List.of(-4, 0, 4),
                List.of(-4, 1, 3), List.of(-4, 2, 2),
                List.of(-2, -2, 4), List.of(-2, 0, 2));
        assertIterableEquals(expected, sol.threeSum(input));
        assertIterableEquals(expected, sol.threeSum1(input));
    }

    @Test
    void threeSum3() {
        int[] input = {};
        List<List<Integer>> expected = List.of();
        assertIterableEquals(expected, sol.threeSum(input));
        assertIterableEquals(expected, sol.threeSum1(input));
    }

    @Test
    void threeSum4() {
        int[] input = {0, 0};
        List<List<Integer>> expected = List.of();
        assertIterableEquals(expected, sol.threeSum(input));
        assertIterableEquals(expected, sol.threeSum1(input));
    }
}