package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0050_PowTest {
    private LC0050_Pow sol;

    @BeforeEach
    void setUp() {
        sol = new LC0050_Pow();
    }

    @Test
    void myPow1() {
        assertEquals(0.0, sol.myPow(2.00000, -2147483648));
    }

    @Test
    void myPow2() {
        assertEquals(1024.0, sol.myPow(2.0, 10));
    }

    @Test
    void myPow3() {
        assertEquals(9.261, sol.myPow(2.1, 3), 0.0000001);
    }

    @Test
    void myPow4() {
        assertEquals(0.25, sol.myPow(2.0, -2));
    }

    @Test
    void myPow5() {
        assertEquals(1, sol.myPow(2.0, 0));
    }
}