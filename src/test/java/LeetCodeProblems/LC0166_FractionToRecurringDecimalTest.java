package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0166_FractionToRecurringDecimalTest {

    @Test
    void fractionToDecimal() {
        LC0166_FractionToRecurringDecimal sol = new LC0166_FractionToRecurringDecimal();
        assertEquals("0.0000000004656612873077392578125", sol.fractionToDecimal(-1, -2147483648));
        assertEquals("-6.25", sol.fractionToDecimal(-50, 8));
        assertEquals("0.5", sol.fractionToDecimal(1, 2));
        assertEquals("2", sol.fractionToDecimal(2, 1));
        assertEquals("0.(012)", sol.fractionToDecimal(4, 333));
    }

    @Test
    void fractionToDecimal1() {
        LC0166_FractionToRecurringDecimal sol = new LC0166_FractionToRecurringDecimal();
        assertEquals("0.0000000004656612873077392578125", sol.fractionToDecimal1(-1, -2147483648));
        assertEquals("-6.25", sol.fractionToDecimal1(-50, 8));
        assertEquals("0.5", sol.fractionToDecimal1(1, 2));
        assertEquals("2", sol.fractionToDecimal1(2, 1));
        assertEquals("0.(012)", sol.fractionToDecimal1(4, 333));
    }
}