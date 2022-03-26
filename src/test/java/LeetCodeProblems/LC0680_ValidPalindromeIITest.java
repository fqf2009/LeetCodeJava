package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0680_ValidPalindromeIITest {
    private LC0680_ValidPalindromeII solution;

    @BeforeEach
    void setup() {
        solution = new LC0680_ValidPalindromeII();
    }

    @Test
    void validPalindrome() {
        assertTrue(solution.validPalindrome("aba"));
        assertTrue(solution.validPalindrome("abca"));
        assertFalse(solution.validPalindrome("abc"));
    }
}