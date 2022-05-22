package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0127_WordLadderTest {
    LC0127_WordLadder sol;

    @BeforeEach
    void setUp() {
        sol = new LC0127_WordLadder();
    }

    @Test
    void ladderLength1() {
        assertEquals(2, sol.ladderLength("a", "c",
                List.of("a", "b", "c")));
    }

    @Test
    void ladderLength2() {
        assertEquals(5, sol.ladderLength("hit", "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void ladderLength3() {
        assertEquals(0, sol.ladderLength("hit", "cog",
                List.of("hot", "dot", "dog", "lot", "log")));
    }
}