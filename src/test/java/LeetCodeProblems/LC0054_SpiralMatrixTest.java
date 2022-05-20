package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0054_SpiralMatrixTest {
    LC0054_SpiralMatrix sol;

    @BeforeEach
    void setUp() {
        sol = new LC0054_SpiralMatrix();
    }

    @Test
    void spiralOrder1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, sol.spiralOrder(matrix));
    }

    @Test
    void spiralOrder2() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12}
        };
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected, sol.spiralOrder(matrix));
    }
}