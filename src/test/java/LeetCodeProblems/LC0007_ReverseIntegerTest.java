package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0007_ReverseIntegerTest {

    @Test
    void reverse() {
        LC0007_ReverseInteger sol = new LC0007_ReverseInteger();
        assertEquals(321, sol.reverse(123));
        assertEquals(-321, sol.reverse(-123));
        assertEquals(21, sol.reverse(120));
        assertEquals(0, sol.reverse(2147483647));
        assertEquals(0, sol.reverse(-2147483648));
    }
}