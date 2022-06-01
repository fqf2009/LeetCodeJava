package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0044_WildcardMatchingTest {

    @Test
    void isMatch() {
        LC0044_WildcardMatching sol = new LC0044_WildcardMatching();
        assertTrue(sol.isMatch("", "*****"));
        assertTrue(sol.isMatch("aa", "aa"));
        assertTrue(sol.isMatch("aa", "*a"));
        assertTrue(sol.isMatch("aa", "?a"));
        assertTrue(sol.isMatch("aa", "*aa"));
        assertTrue(sol.isMatch("aa", "*"));
        assertFalse(sol.isMatch("cb", "?a"));
        assertFalse(sol.isMatch("aa", "*b"));
        assertFalse(sol.isMatch("aa", "a"));
    }
}