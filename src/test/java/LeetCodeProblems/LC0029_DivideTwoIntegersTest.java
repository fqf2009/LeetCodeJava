package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0029_DivideTwoIntegersTest {

    @Test
    void divide() {
        LC0029_DivideTwoIntegers sol = new LC0029_DivideTwoIntegers();
        assertEquals(333, sol.divide(1000, 3));
        assertEquals(3, sol.divide(10, 3));
        assertEquals(-2, sol.divide(7, -3));
        assertEquals(2147483647, sol.divide(-2147483648, -1));
        assertEquals(-2147483648, sol.divide(-2147483648, 1));
        assertEquals(-1073741824, sol.divide(-2147483648, 2));
    }
}