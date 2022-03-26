package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC1762_BuildingsWithOceanViewTest {
    private LC1762_BuildingsWithOceanView solution;

    @BeforeEach
    void setup() {
        solution = new LC1762_BuildingsWithOceanView();
    }

    void findBuildingsTest(int[] heights, int[] expected) {
        int[] buildings = solution.findBuildings(heights);
        System.out.println(Arrays.toString(buildings));
        assertArrayEquals(expected, buildings);
    }

    @Test
    void findBuildingsTestCase1() {
        int[] heights = {4, 2, 3, 1};
        int[] expected = {0, 2, 3};
        findBuildingsTest(heights, expected);
    }

    @Test
    void findBuildingsTestCase2() {
        int[] heights = {4, 3, 2, 1};
        int[] expected = {0, 1, 2, 3};
        findBuildingsTest(heights, expected);
    }

    @Test
    void findBuildingsTestCase3() {
        int[] heights = {1, 3, 2, 4};
        int[] expected = {3};
        findBuildingsTest(heights, expected);
    }

    @Test
    void findBuildingsTestCase4() {
        int[] heights = {1};
        int[] expected = {0};
        findBuildingsTest(heights, expected);
    }
}