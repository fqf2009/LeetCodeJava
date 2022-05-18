package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0014_longestCommonPrefixTest {
    private LC0014_longestCommonPrefix sol;

    @BeforeEach
    void setUp() {
        sol = new LC0014_longestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("fl", sol.longestCommonPrefix(new String[]{"flower", "flow", "fl"}));
        assertEquals("", sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void longestCommonPrefix1() {
        assertEquals("fl", sol.longestCommonPrefix1(new String[]{"flower", "flow", "flight"}));
        assertEquals("fl", sol.longestCommonPrefix1(new String[]{"flower", "flow", "fl"}));
        assertEquals("", sol.longestCommonPrefix1(new String[]{"dog", "racecar", "car"}));
    }
}