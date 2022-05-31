package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0028_Implement_strStrTest {

    @Test
    void strStr() {
        LC0028_Implement_strStr sol = new LC0028_Implement_strStr();
        assertEquals(2, sol.strStr("hello", "ll"));
        assertEquals(0, sol.strStr("", ""));
        assertEquals(0, sol.strStr("a", "a"));
        assertEquals(0, sol.strStr("hello", ""));
        assertEquals(-1, sol.strStr("aaaaa", "bba"));
        assertEquals(-1, sol.strStr("aaabb", "bba"));
        assertEquals(6, sol.strStr("mississippi", "sipp"));
    }

    @Test
    void strStr1() {
        LC0028_Implement_strStr sol = new LC0028_Implement_strStr();
        assertEquals(2, sol.strStr1("hello", "ll"));
        assertEquals(0, sol.strStr1("", ""));
        assertEquals(0, sol.strStr1("a", "a"));
        assertEquals(0, sol.strStr1("hello", ""));
        assertEquals(-1, sol.strStr1("aaaaa", "bba"));
        assertEquals(-1, sol.strStr1("aaabb", "bba"));
        assertEquals(6, sol.strStr1("mississippi", "sipp"));
    }
}