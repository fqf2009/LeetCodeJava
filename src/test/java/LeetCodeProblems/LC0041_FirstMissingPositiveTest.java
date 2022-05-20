package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0041_FirstMissingPositiveTest {

    @Test
    void firstMissingPositive() {
        LC0041_FirstMissingPositive sol = new LC0041_FirstMissingPositive();
        assertEquals(3, sol.firstMissingPositive(new int[]{2, 1}));
        assertEquals(3, sol.firstMissingPositive(new int[]{2, 1}));
        assertEquals(2, sol.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, sol.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}