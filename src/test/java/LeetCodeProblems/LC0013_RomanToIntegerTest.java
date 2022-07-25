package LeetCodeProblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LC0013_RomanToIntegerTest {
    private LC0013_RomanToInteger solution;

    @BeforeEach
    void setUp() {
        solution = new LC0013_RomanToInteger();
    }

    @Test
    void romanToInt() throws Exception {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        Assertions.assertThrows(NullPointerException.class, () ->{
            Thread.sleep(10);
            solution.romanToInt(null);
        });
        Assertions.assertTimeout(Duration.ofMillis(100), ()-> Thread.sleep(10));
    }

    @Test
    void romanToInt1() {
        assertEquals(3, solution.romanToInt1("III"));
        assertEquals(4, solution.romanToInt1("IV"));
        assertEquals(9, solution.romanToInt1("IX"));
        assertEquals(58, solution.romanToInt1("LVIII"));
        assertEquals(1994, solution.romanToInt1("MCMXCIV"));
    }
}