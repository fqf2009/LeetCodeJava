package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0005_LongestPalindromicSubstringTest {
    private LC0005_LongestPalindromicSubstring solution;

    @BeforeEach
    void setUp() {
        solution = new LC0005_LongestPalindromicSubstring();
    }

    void longestPalindromeTest(String s, String expected) {
        String pal = solution.longestPalindrome(s);
        assertEquals(expected, pal);
    }

    @Test
    void longestPalindromeTest1() {
        longestPalindromeTest("eabcb", "bcb");
    }

    @Test
    void longestPalindromeTest2() {
        longestPalindromeTest("babad", "bab");
    }

    @Test
    void longestPalindromeTest3() {
        longestPalindromeTest("cbbd", "bb");
    }

    @Test
    void longestPalindromeTest4() {
        longestPalindromeTest("a", "a");
    }

    @Test
    void longestPalindromeTest5() {
        longestPalindromeTest("ac", "a");
    }
}
