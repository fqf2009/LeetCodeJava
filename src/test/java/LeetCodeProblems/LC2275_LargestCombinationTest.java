package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2275_LargestCombinationTest {
    private LC2275_LargestCombination solution;

    @BeforeEach
    void setUp() {
        solution = new LC2275_LargestCombination();
    }

    @Test
    void largestCombinationTest1() {
        assertEquals(4, solution.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
    }

    @Test
    void largestCombinationTest2() {
        assertEquals(2, solution.largestCombination(new int[]{8, 8}));
    }
}