package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0042_TrappingRainWaterTest {
    @Test
    void testCase() {
        LC0042_TrappingRainWater sol = new LC0042_TrappingRainWater();
        assertEquals(6, sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, sol.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void testCase1() {
        LC0042_TrappingRainWater1 sol = new LC0042_TrappingRainWater1();
        assertEquals(6, sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, sol.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}