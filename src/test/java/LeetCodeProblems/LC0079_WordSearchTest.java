package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0079_WordSearchTest {
    private LC0079_WordSearch sol;

    @BeforeEach
    void setUp() {
        sol = new LC0079_WordSearch();
    }

    @Test
    void exist1() {
        char[][] board = {
                {'Z', 'Z', 'Z', 'Z', 'Z'},
                {'Z', 'C', 'B', 'A', 'B'},
                {'A', 'D', 'E', 'D', 'C'},
                {'B', 'E', 'Z', 'Z', 'Z'}};
        String word = "ABEDCBA";
        assertTrue(sol.exist(board, word));
    }

    @Test
    void exist2() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        assertTrue(sol.exist(board, word));
    }

    @Test
    void exist3() {
        char[][] board = {
                {'a'}};
        String word = "a";
        assertTrue(sol.exist(board, word));
    }

    @Test
    void exist4() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        assertTrue(sol.exist(board, word));
    }

    @Test
    void exist5() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABCG";
        assertFalse(sol.exist(board, word));
    }
}