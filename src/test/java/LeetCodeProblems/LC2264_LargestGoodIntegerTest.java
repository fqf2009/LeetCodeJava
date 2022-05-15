package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2264_LargestGoodIntegerTest {

    @Test
    void largestGoodInteger1() {
        LC2264_LargestGoodInteger sol = new LC2264_LargestGoodInteger();
        assertEquals("222", sol.largestGoodInteger("222"));
        assertEquals("777", sol.largestGoodInteger("6777133339"));
        assertEquals("000", sol.largestGoodInteger("2300019"));
        assertEquals("", sol.largestGoodInteger("42352338"));
    }
}