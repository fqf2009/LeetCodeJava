package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC1386_CinemaSeatAllocationTest {
    LC1386_CinemaSeatAllocation sol;

    @BeforeEach
    void setUp() {
        sol = new LC1386_CinemaSeatAllocation();
    }

    @Test
    void maxNumberOfFamilies1() {
        int[][] reserved = {{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}};
        assertEquals(4, sol.maxNumberOfFamilies(3, reserved));
    }

    @Test
    void maxNumberOfFamilies2() {
        int[][] reserved = {{2, 1}, {1, 8}, {2, 6}};
        assertEquals(2, sol.maxNumberOfFamilies(2, reserved));
    }

    @Test
    void maxNumberOfFamilies3() {
        int[][] reserved = {{4, 3}, {1, 4}, {4, 6}, {1, 7}};
        assertEquals(4, sol.maxNumberOfFamilies(4, reserved));
    }
}