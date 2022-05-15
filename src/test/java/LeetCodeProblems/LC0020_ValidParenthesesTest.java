package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0020_ValidParenthesesTest {
    private LC0020_ValidParentheses solution;

    @BeforeEach
    void setUp() {
        solution = new LC0020_ValidParentheses();
    }

    @Test
    void isValidTest1() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void isValidTest2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isValidTest3() {
        assertFalse(solution.isValid("(]"));
    }
}