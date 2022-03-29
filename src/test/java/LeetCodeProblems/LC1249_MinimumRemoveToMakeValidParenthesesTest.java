package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC1249_MinimumRemoveToMakeValidParenthesesTest {
    private LC1249_MinimumRemoveToMakeValidParentheses solution;

    @BeforeEach
    void setup() {
        solution = new LC1249_MinimumRemoveToMakeValidParentheses();
    }

    void minRemoveToMakeValidTest(String input, String expected1, String expected2) {
        String ans = solution.minRemoveToMakeValid(input);
        String ans1 = solution.minRemoveToMakeValid1(input);
        System.out.println(ans);
        System.out.println(ans1);
        if (!expected2.isEmpty()) {
            assertTrue(ans.equals(expected1) || ans.equals(expected2));
            assertTrue(ans1.equals(expected1) || ans1.equals(expected2));
        } else {
            assertEquals(expected1, ans);
            assertEquals(expected1, ans1);
        }
    }

    @Test
    void minRemoveToMakeValidTestCase1() {
        minRemoveToMakeValidTest("lee(t(c)o)de)", "lee(t(c)o)de", "lee(t(c)ode)");
    }

    @Test
    void minRemoveToMakeValidTestCase2() {
        minRemoveToMakeValidTest("a)b(c)d", "ab(c)d", "");
    }

    @Test
    void minRemoveToMakeValidTestCase3() {
        minRemoveToMakeValidTest("))((", "", "");
    }
}