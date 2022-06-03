package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC0443_StringCompressionTest {
    LC0443_StringCompression sol;

    @BeforeEach
    void setUp() {
        sol = new LC0443_StringCompression();
    }

    void compressTest(char[] input, char[] expected) {
        assertEquals(expected.length, sol.compress(input));
        assertArrayEquals(expected, Arrays.copyOfRange(input, 0, expected.length));
    }

    @Test
    void compress1() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] expected = {'a', '2', 'b', '2', 'c', '3'};
        compressTest(input, expected);
    }

    @Test
    void compress2() {
        char[] input = {'a'};
        char[] expected = {'a'};
        compressTest(input, expected);
    }

    @Test
    void compress3() {
        char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] expected = {'a', 'b', '1', '2'};
        compressTest(input, expected);
    }
}