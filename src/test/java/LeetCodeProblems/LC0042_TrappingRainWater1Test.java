package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC0042_TrappingRainWater1Test {
    private LC0042_TrappingRainWater1 solution;

    @BeforeEach
    void setup() {
        solution = new LC0042_TrappingRainWater1();
    }

    @Test
    void testCase1() {
        int rain = solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(rain);
        assertEquals(6, rain);
    }

    @Test
    void testCase2() {
        int rain = solution.trap(new int[]{4, 2, 0, 3, 2, 5});
        System.out.println(rain);
        assertEquals(9, rain);
    }
}