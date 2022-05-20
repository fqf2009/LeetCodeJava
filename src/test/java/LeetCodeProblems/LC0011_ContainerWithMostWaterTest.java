package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0011_ContainerWithMostWaterTest {
    LC0011_ContainerWithMostWater sol;

    @BeforeEach
    void setUp() {
        sol = new LC0011_ContainerWithMostWater();
    }


    @Test
    void maxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, sol.maxArea(height));
    }

    @Test
    void maxArea2() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 8};
        assertEquals(56, sol.maxArea(height));
    }

    @Test
    void maxArea3() {
        int[] height = {1, 1};
        assertEquals(1, sol.maxArea(height));
    }
}