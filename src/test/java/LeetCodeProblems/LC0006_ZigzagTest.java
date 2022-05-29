package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0006_ZigzagTest {

    @Test
    void convert() {
        LC0006_Zigzag sol = new LC0006_Zigzag();
        assertEquals("PAHNAPLSIIGYIR", sol.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", sol.convert("PAYPALISHIRING", 4));
        assertEquals("A", sol.convert("A", 3));
        assertEquals("AB", sol.convert("AB", 3));
    }

    @Test
    void convert1() {
        LC0006_Zigzag sol = new LC0006_Zigzag();
        assertEquals("PAHNAPLSIIGYIR", sol.convert1("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", sol.convert1("PAYPALISHIRING", 4));
        assertEquals("A", sol.convert1("A", 3));
        assertEquals("AB", sol.convert1("AB", 3));
    }
}