package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0907_SumOfSubarrayMinimumsTest {
    LC0907_SumOfSubarrayMinimums sol;

    @BeforeEach
    void setUp() {
        sol = new LC0907_SumOfSubarrayMinimums();
    }

    @Test
    void sumSubarrayMins1() {
        int[] arr = {3, 1, 2, 4};
        assertEquals(17, sol.sumSubarrayMins(arr));
    }

    @Test
    void sumSubarrayMins2() {
        int[] arr = {11, 81, 94, 43, 3};
        assertEquals(444, sol.sumSubarrayMins(arr));
    }

    @Test
    void sumSubarrayMins3() {
        int[] arr = {2, 3, 8, 5, 6, 7, 5, 3, 9};
        assertEquals(169, sol.sumSubarrayMins(arr));
    }

    @Test
    void sumSubarrayMins4() {
        int[] arr = {2, 3, 8, 5, 2121483619, 2121483620, 2120483621, 3, 9};
        assertEquals(725901772, sol.sumSubarrayMins(arr));
    }
}