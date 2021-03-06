package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2267_CheckValidParenthesesStringPathTest {
    private LC2267_CheckValidParenthesesStringPath solution;

    @BeforeEach
    void setUp() {
        solution = new LC2267_CheckValidParenthesesStringPath();
    }

    @Test
    void hasValidPath1() {
        char[][] grid = {
                {'(', '(', '('},
                {')', '(', ')'},
                {'(', '(', ')'},
                {'(', '(', ')'}
        };
        assertTrue(solution.hasValidPath(grid));
    }

    @Test
    void hasValidPath2() {
        char[][] grid = {
                {')', ')'},
                {'(', '('}
        };
        assertFalse(solution.hasValidPath(grid));
    }

    @Test
    void hasValidPath3() {
        char[][] grid = {
                {'(', ')', ')', '(', '(', '(', '(', ')', ')', '(', ')', '(', ')', '(', '(', '(', '(', ')', '(', ')', '('},
                {'(', '(', ')', ')', '(', ')', ')', ')', '(', ')', '(', ')', '(', '(', ')', '(', '(', '(', '(', '(', ')'},
                {')', ')', '(', ')', ')', '(', '(', ')', '(', '(', ')', '(', ')', ')', '(', ')', ')', '(', '(', ')', ')'},
                {'(', '(', ')', '(', ')', '(', ')', ')', ')', '(', ')', '(', '(', ')', '(', ')', ')', '(', ')', ')', ')'},
                {'(', '(', '(', ')', '(', '(', ')', '(', ')', ')', '(', ')', ')', ')', ')', ')', ')', '(', ')', '(', '('},
                {')', ')', '(', '(', ')', ')', ')', ')', ')', '(', ')', ')', ')', '(', '(', ')', '(', '(', '(', '(', ')'},
                {')', ')', ')', ')', '(', ')', '(', ')', '(', '(', ')', '(', '(', ')', '(', '(', ')', ')', '(', ')', '('},
                {'(', ')', '(', '(', '(', ')', ')', ')', ')', '(', '(', ')', '(', '(', ')', ')', '(', ')', ')', ')', '('},
                {'(', ')', '(', ')', '(', '(', '(', '(', ')', '(', '(', '(', '(', '(', '(', ')', '(', ')', '(', ')', ')'},
                {'(', ')', '(', '(', '(', ')', '(', ')', ')', ')', ')', '(', '(', '(', '(', ')', ')', '(', '(', '(', ')'},
                {'(', '(', ')', '(', ')', ')', '(', ')', '(', ')', ')', ')', ')', ')', '(', ')', '(', ')', ')', ')', '('},
                {')', '(', '(', '(', ')', '(', ')', ')', '(', ')', '(', ')', '(', '(', ')', '(', '(', ')', '(', '(', ')'},
                {'(', ')', '(', ')', ')', '(', '(', ')', '(', ')', '(', ')', ')', ')', '(', '(', '(', '(', ')', '(', ')'},
                {'(', '(', ')', '(', ')', ')', '(', '(', '(', ')', '(', ')', '(', '(', ')', ')', '(', '(', '(', ')', ')'},
                {'(', '(', '(', '(', ')', ')', '(', ')', '(', '(', '(', ')', ')', '(', ')', '(', ')', ')', ')', ')', '('},
                {'(', '(', '(', ')', ')', ')', '(', ')', ')', '(', ')', ')', '(', '(', ')', '(', ')', '(', '(', '(', ')'},
                {')', ')', ')', ')', ')', ')', '(', ')', ')', ')', '(', '(', ')', '(', ')', '(', '(', '(', '(', ')', ')'}

        };
        assertFalse(solution.hasValidPath(grid));
    }

    @Test
    void hasValidPath4() {
        char[][] grid = {
                {'(', '(', ')', '(', ')', '(', '(', ')', '(', '(', ')', ')', ')', ')', ')', '(', ')', '(', '(', ')', '(', '(', ')', ')', ')', ')', ')', '(', '(', '(', '('},
                {')', '(', '(', '(', ')', '(', ')', '(', '(', ')', ')', ')', ')', '(', ')', ')', '(', '(', ')', ')', '(', ')', '(', ')', '(', '(', ')', '(', ')', '(', '('},
                {')', ')', '(', '(', ')', '(', '(', ')', ')', ')', ')', '(', '(', ')', ')', '(', ')', '(', ')', ')', '(', '(', '(', ')', ')', ')', '(', ')', ')', '(', ')'},
                {'(', '(', ')', '(', ')', '(', '(', ')', '(', '(', '(', ')', ')', '(', ')', '(', ')', ')', ')', ')', ')', ')', '(', '(', ')', '(', ')', '(', ')', '(', '('},
                {')', ')', '(', ')', ')', '(', '(', '(', ')', ')', '(', ')', '(', ')', ')', ')', '(', '(', '(', ')', ')', '(', ')', '(', ')', ')', '(', '(', '(', '(', ')'},
                {')', ')', '(', '(', ')', '(', ')', '(', ')', '(', ')', '(', ')', ')', '(', ')', '(', ')', ')', '(', ')', '(', '(', '(', ')', '(', ')', ')', ')', '(', '('},
                {')', '(', '(', '(', '(', '(', '(', ')', ')', '(', '(', ')', '(', ')', ')', '(', ')', ')', ')', '(', '(', '(', ')', '(', '(', ')', ')', '(', ')', '(', ')'},
                {')', ')', '(', '(', '(', '(', '(', '(', '(', ')', ')', '(', '(', '(', '(', '(', '(', '(', '(', '(', '(', '(', '(', ')', ')', '(', '(', ')', ')', '(', ')'},
                {'(', ')', ')', ')', '(', '(', ')', ')', ')', ')', '(', ')', ')', '(', ')', ')', '(', '(', '(', '(', '(', '(', '(', ')', ')', '(', '(', ')', ')', '(', '('},
                {'(', '(', ')', '(', ')', ')', ')', ')', '(', '(', '(', ')', ')', ')', '(', ')', '(', '(', ')', '(', '(', '(', ')', '(', '(', '(', '(', '(', ')', ')', ')'},
                {'(', ')', '(', '(', '(', '(', ')', '(', '(', ')', ')', '(', '(', ')', '(', '(', '(', ')', '(', '(', '(', ')', ')', '(', ')', ')', '(', ')', '(', '(', ')'},
                {')', ')', '(', '(', '(', '(', ')', '(', '(', ')', ')', '(', ')', ')', '(', ')', '(', '(', '(', '(', '(', '(', '(', ')', '(', '(', ')', ')', '(', '(', '('},
                {'(', ')', ')', ')', '(', ')', '(', '(', '(', ')', ')', ')', '(', ')', '(', ')', ')', '(', '(', '(', '(', ')', '(', ')', ')', ')', ')', ')', ')', '(', '('},
                {'(', '(', '(', '(', '(', '(', ')', ')', '(', ')', '(', '(', '(', ')', ')', '(', ')', '(', ')', '(', ')', '(', '(', '(', ')', ')', ')', '(', ')', '(', '('},
                {'(', ')', ')', ')', ')', '(', '(', ')', ')', ')', ')', ')', ')', '(', '(', ')', '(', ')', ')', '(', ')', '(', ')', ')', ')', '(', '(', ')', '(', '(', '('},
                {'(', ')', ')', '(', '(', ')', ')', '(', ')', ')', '(', '(', '(', ')', ')', ')', ')', '(', '(', '(', ')', ')', '(', ')', '(', '(', '(', '(', ')', ')', ')'},
                {')', '(', '(', ')', '(', '(', ')', ')', ')', '(', '(', '(', '(', ')', '(', ')', ')', ')', '(', ')', '(', ')', '(', '(', ')', '(', '(', '(', '(', '(', '('},
                {'(', ')', '(', ')', '(', '(', ')', ')', ')', ')', ')', '(', '(', ')', ')', '(', ')', '(', ')', ')', ')', ')', '(', '(', '(', ')', '(', ')', '(', ')', ')'},
                {'(', ')', '(', ')', ')', ')', '(', '(', '(', ')', '(', ')', '(', '(', ')', ')', '(', ')', '(', ')', '(', ')', '(', '(', '(', '(', '(', ')', '(', ')', '('},
                {')', ')', ')', ')', ')', '(', ')', ')', '(', '(', ')', '(', ')', ')', '(', ')', ')', '(', '(', '(', '(', ')', '(', '(', '(', '(', ')', ')', ')', ')', '('},
                {')', '(', '(', '(', '(', '(', ')', '(', ')', ')', ')', ')', '(', '(', '(', ')', ')', '(', ')', ')', '(', '(', '(', '(', '(', '(', ')', ')', '(', '(', '('},
                {'(', '(', '(', ')', ')', '(', ')', '(', ')', ')', ')', ')', '(', ')', ')', ')', ')', '(', ')', '(', '(', '(', '(', ')', '(', '(', '(', '(', '(', '(', ')'}
        };
        assertFalse(solution.hasValidPath(grid));
    }

}