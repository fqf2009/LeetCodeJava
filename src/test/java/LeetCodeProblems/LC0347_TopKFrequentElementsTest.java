package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0347_TopKFrequentElementsTest {
    LC0347_TopKFrequentElements sol;

    @BeforeEach
    void setUp() {
        sol = new LC0347_TopKFrequentElements();
    }

    @Test
    void topKFrequent1() {
        int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int[] expected = {1, 3};
        int[] res = sol.topKFrequent(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);

        res = sol.topKFrequent1(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);
    }

    @Test
    void topKFrequent2() {
        int[] input = {1, 1, 1, 2, 2, 3};
        int[] expected = {1, 2};
        int[] res = sol.topKFrequent(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);

        res = sol.topKFrequent1(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);
    }

    @Test
    void topKFrequent3() {
        int[] input = {1};
        int[] expected = {1};
        int[] res = sol.topKFrequent(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);

        res = sol.topKFrequent1(input, 2);
        Arrays.sort(res);
        assertArrayEquals(expected, res);
    }
}