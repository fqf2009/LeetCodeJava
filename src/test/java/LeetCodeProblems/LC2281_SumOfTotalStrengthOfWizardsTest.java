package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2281_SumOfTotalStrengthOfWizardsTest {
    LC2281_SumOfTotalStrengthOfWizards sol;

    @BeforeEach
    void setUp() {
        sol = new LC2281_SumOfTotalStrengthOfWizards();
    }

    @Test
    void totalStrength1() {
        assertEquals(44, sol.totalStrength(new int[]{1, 3, 1, 2}));
    }

    @Test
    void totalStrength2() {
        assertEquals(213, sol.totalStrength(new int[]{5, 4, 6}));
    }
}