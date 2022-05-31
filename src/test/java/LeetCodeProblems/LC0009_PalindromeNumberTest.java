package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0009_PalindromeNumberTest {

    @Test
    void isPalindrome() {
        LC0009_PalindromeNumber sol = new LC0009_PalindromeNumber();
        assertTrue(sol.isPalindrome(121));
        assertTrue(sol.isPalindrome(0));
        assertFalse(sol.isPalindrome(-121));
        assertFalse(sol.isPalindrome(10));
    }
}