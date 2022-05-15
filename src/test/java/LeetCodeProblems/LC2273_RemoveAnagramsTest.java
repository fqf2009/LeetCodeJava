package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC2273_RemoveAnagramsTest {
    private LC2273_RemoveAnagrams solution;

    @BeforeEach
    void setUp() {
        solution = new LC2273_RemoveAnagrams();
    }

    void removeAnagramsTest(String[] words, List<String> expected) {
        List<String> res = solution.removeAnagrams(words);
        assertEquals(expected, res);
    }

    @Test
    void removeAnagramsTest1() {
        String[] words = new String[]{"a", "b", "a"};
        List<String> expected = Arrays.asList("a", "b", "a");
        removeAnagramsTest(words, expected);
    }

    @Test
    void removeAnagramsTest2() {
        String[] words = new String[]{"abba", "baba", "bbaa", "cd", "cd"};
        List<String> expected = Arrays.asList("abba", "cd");
        removeAnagramsTest(words, expected);
    }

    @Test
    void removeAnagramsTest3() {
        String[] words = new String[]{"a", "b", "c", "d", "e"};
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e");
        removeAnagramsTest(words, expected);
    }
}