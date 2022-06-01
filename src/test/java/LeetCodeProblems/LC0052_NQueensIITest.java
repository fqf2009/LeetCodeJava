package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0052_NQueensIITest {

    @Test
    void totalNQueens() {
        LC0052_NQueensII sol = new LC0052_NQueensII();
        assertEquals(2, sol.totalNQueens(4));
    }
}