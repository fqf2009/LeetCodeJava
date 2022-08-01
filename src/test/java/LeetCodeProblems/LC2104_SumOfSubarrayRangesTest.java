package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2104_SumOfSubarrayRangesTest {
    LC2104_SumOfSubarrayRanges sol;

    @BeforeEach
    void setUp() {
        sol = new LC2104_SumOfSubarrayRanges();
    }

    @Test
    void subArrayRanges() {
        Long r = sol.subArrayRanges(new int[]{4, -2, -3, 4, 1});
        assertEquals(59, r);
    }
}