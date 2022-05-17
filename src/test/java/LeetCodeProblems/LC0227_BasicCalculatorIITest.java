package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0227_BasicCalculatorIITest {
    private LC0227_BasicCalculatorII sol;

    @BeforeEach
    void setUp() {
        sol = new LC0227_BasicCalculatorII();
    }

    @Test
    void calculate1() {
        assertEquals(-24, sol.calculate("1*2-3/4+5*6-7*8+9/10"));
        assertEquals(-24, sol.calculate1("1*2-3/4+5*6-7*8+9/10"));
    }

    @Test
    void calculate2() {
        assertEquals(1, sol.calculate("-3+2*2"));
        assertEquals(1, sol.calculate1("-3+2*2"));
    }

    @Test
    void calculat3() {
        assertEquals(7, sol.calculate("3+2*2"));
        assertEquals(7, sol.calculate1("3+2*2"));
    }

    @Test
    void calculat4() {
        assertEquals(1, sol.calculate(" 3/2 "));
        assertEquals(1, sol.calculate1(" 3/2 "));
    }

    @Test
    void calculat5() {
        assertEquals(5, sol.calculate(" 3+5 / 2 "));
        assertEquals(5, sol.calculate1(" 3+5 / 2 "));
    }

    @Test
    void calculat6() {
        assertEquals(-21, sol.calculate1(" - 3 - 10 / 5 * 3 ^ 2 "));
    }
}
