package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0010_RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        LC0010_RegularExpressionMatching sol = new LC0010_RegularExpressionMatching();
        assertFalse(sol.isMatch("aa", "a"));
        assertTrue(sol.isMatch("aa", "a*"));
        assertTrue(sol.isMatch("ab", ".*"));
        assertTrue(sol.isMatch("aab", "c*a*b"));
        assertFalse(sol.isMatch("mississippi", "mis*is*p*."));
    }
}