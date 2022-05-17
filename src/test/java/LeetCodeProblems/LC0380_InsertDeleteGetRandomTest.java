package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0380_InsertDeleteGetRandomTest {
    private LC0380_InsertDeleteGetRandom sol;

    @BeforeEach
    void setUp() {
        sol = new LC0380_InsertDeleteGetRandom();
    }

    @Test
    void randomizedSetTestCase1() {
        assertTrue(sol.insert(1));
        assertFalse(sol.remove(2));
        assertTrue(sol.insert(2));
        int r = sol.getRandom();
        assertTrue(r == 1 || r == 2);
        assertTrue(sol.remove(1));
        assertFalse(sol.insert(2));
        assertEquals(2, sol.getRandom());
    }
}