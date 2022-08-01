package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0472_ConcatenatedWordsTest {
    LC0472_ConcatenatedWords sol;

    @BeforeEach
    void setUp() {
        sol = new LC0472_ConcatenatedWords();
    }

    @Test
    void findAllConcatenatedWordsInADict1() {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog",
                "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> expected = List.of("catsdogcats", "dogcatsdog", "ratcatdogcat");
        assertIterableEquals(expected, sol.findAllConcatenatedWordsInADict(words));
    }

    @Test
    void findAllConcatenatedWordsInADict2() {
        String[] words = {"cat", "dog", "catdog"};
        List<String> expected = List.of("catdog");
        assertIterableEquals(expected, sol.findAllConcatenatedWordsInADict(words));
    }
}