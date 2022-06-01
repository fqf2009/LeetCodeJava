package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0051_NQueensTest {

    @Test
    void solveNQueens() {
        LC0051_NQueens sol = new LC0051_NQueens();
        List<List<String>> expected = List.of(
                List.of(".Q..", "...Q", "Q...", "..Q."),
                List.of("..Q.", "Q...", "...Q", ".Q.."));
        assertIterableEquals(expected, sol.solveNQueens(4));
    }
}