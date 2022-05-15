package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0121_BestTimeBuySellStockTest {
    private LC0121_BestTimeBuySellStock solution;

    @BeforeEach
    void setUp() {
        solution = new LC0121_BestTimeBuySellStock();
    }

    @Test
    void maxProfitTest1() {
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void maxProfitTest2() {
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}