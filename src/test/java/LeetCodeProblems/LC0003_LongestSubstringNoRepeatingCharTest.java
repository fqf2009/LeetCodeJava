package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0003_LongestSubstringNoRepeatingCharTest {
    private LC0003_LongestSubstringNoRepeatingChar solution;

    @BeforeEach
    void setUp() {
        solution = new LC0003_LongestSubstringNoRepeatingChar();
    }

    @Test
    void lengthOfLongestSubstringTest1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }
}