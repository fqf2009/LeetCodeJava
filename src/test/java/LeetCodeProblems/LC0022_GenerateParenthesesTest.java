package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0022_GenerateParenthesesTest {
    private LC0022_GenerateParentheses sol;

    @BeforeEach
    void setUp() {
        sol = new LC0022_GenerateParentheses();
    }

    void generateParenthesisTest(int n, List<String> expected) {
        List<String> res = sol.generateParenthesis(n);
        assertTrue(expected.size() == res.size() && expected.containsAll(res) &&
                res.containsAll(expected));

        List<String> res1 = sol.generateParenthesis(n);
        assertTrue(expected.size() == res1.size() && expected.containsAll(res1) &&
                res1.containsAll(expected));
    }

    @Test
    void generateParenthesis1() {
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        generateParenthesisTest(3, expected);
    }

    @Test
    void generateParenthesis2() {
        List<String> expected = List.of(
                "(((())))", "((()()))", "((())())", "((()))()", "(()(()))",
                "(()()())", "(()())()", "(())(())", "(())()()", "()((()))",
                "()(()())", "()(())()", "()()(())", "()()()()");
        generateParenthesisTest(4, expected);
    }
}