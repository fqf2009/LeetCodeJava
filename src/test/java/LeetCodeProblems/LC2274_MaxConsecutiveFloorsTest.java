package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2274_MaxConsecutiveFloorsTest {
    private LC2274_MaxConsecutiveFloors solution;

    @BeforeEach
    void setUp() {
        solution = new LC2274_MaxConsecutiveFloors();
    }

    @Test
    void maxConsecutiveTest1() {
        assertEquals(32, solution.maxConsecutive(6, 39, new int[]{38}));
    }

    @Test
    void maxConsecutiveTest2() {
        assertEquals(3, solution.maxConsecutive(2, 9, new int[]{4, 6}));
    }

    @Test
    void maxConsecutiveTest3() {
        assertEquals(0, solution.maxConsecutive(6, 8, new int[]{7, 6, 8}));
    }
}