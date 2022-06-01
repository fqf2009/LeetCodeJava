package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0043_MultiplyStringsTest {

    @Test
    void multiply() {
        LC0043_MultiplyStrings sol = new LC0043_MultiplyStrings();
        assertEquals("6", sol.multiply("2", "3"));
        assertEquals("0", sol.multiply("0", "0"));
        assertEquals("56088", sol.multiply("123", "456"));
        assertEquals("121932631112635269", sol.multiply("123456789", "987654321"));
    }
}