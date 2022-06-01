package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0030_SubstringWithConcatenationOfAllWordsTest {
    LC0030_SubstringWithConcatenationOfAllWords sol;

    @BeforeEach
    void setUp() {
        sol = new LC0030_SubstringWithConcatenationOfAllWords();
    }

    void findSubstringTest(String s, String[] words, List<Integer> expected) {
        assertIterableEquals(expected, sol.findSubstring(s, words));
        assertIterableEquals(expected, sol.findSubstring1(s, words));
    }

    @Test
    void findSubstring1() {
        String[] words = {"foo", "bar"};
        List<Integer> expected = List.of(0, 9);
        findSubstringTest("barfoothefoobarman", words, expected);
    }

    @Test
    void findSubstring2() {
        String[] words = {"word", "good", "best", "word"};
        List<Integer> expected = List.of();
        findSubstringTest("wordgoodgoodgoodbestword", words, expected);
    }

    @Test
    void findSubstring3() {
        String[] words = {"bar", "foo", "the"};
        List<Integer> expected = List.of(6, 9, 12);
        findSubstringTest("barfoofoobarthefoobarman", words, expected);
    }
}