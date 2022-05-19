package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0017_LetterCombinationsOfPhoneNumberTest {
    LC0017_LetterCombinationsOfPhoneNumber sol;

    @BeforeEach
    void setUp() {
        sol = new LC0017_LetterCombinationsOfPhoneNumber();
    }

    void letterCombinationsTest(String digits, List<String> expected) {
        List<String> res = sol.letterCombinations(digits);
        assertTrue(expected.size() == res.size() &&
                expected.containsAll(res) && res.containsAll(expected));
    }

    @Test
    void letterCombinationsTest1() {
        List<String> expected = List.of();
        letterCombinationsTest("", expected);
    }

    @Test
    void letterCombinationsTest2() {
        List<String> expected = List.of("w", "x", "y", "z");
        letterCombinationsTest("9", expected);
    }

    @Test
    void letterCombinationsTest3() {
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        letterCombinationsTest("23", expected);
    }

    @Test
    void letterCombinationsTest4() {
        List<String> expected = List.of(
                "adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
                "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi",
                "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi");
        letterCombinationsTest("234", expected);
    }
}