package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0008_StringToIntegerTest {

    @Test
    void myAtoi() {
        LC0008_StringToInteger sol = new LC0008_StringToInteger();
        assertEquals(0, sol.myAtoi("00000-52a1234"));
        assertEquals(0, sol.myAtoi(" + 52"));
        assertEquals(-52, sol.myAtoi("   -52"));
        assertEquals(4193, sol.myAtoi("4193 with words"));
        assertEquals(0, sol.myAtoi("words and 987"));
        assertEquals(2147483647, sol.myAtoi(" +2147483648"));
        assertEquals(-2147483648, sol.myAtoi(" -2147483648"));
    }
}