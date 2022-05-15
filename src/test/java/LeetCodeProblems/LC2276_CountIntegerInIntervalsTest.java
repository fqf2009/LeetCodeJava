package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2276_CountIntegerInIntervalsTest {

    @Test
    void testcase1() {
        LC2276_CountIntegerInIntervals counter = new LC2276_CountIntegerInIntervals();
        counter.add(2, 3);
        counter.add(7, 10);
        assertEquals(6, counter.count());
        counter.add(5, 8);
        assertEquals(8, counter.count());
    }

    @Test
    void testcase2() {
        LC2276_CountIntegerInIntervals counter = new LC2276_CountIntegerInIntervals();
        assertEquals(0, counter.count());
        counter.add(8, 43);
        counter.add(13, 16);
        counter.add(26, 33);
        counter.add(28, 36);
        counter.add(29, 37);
        assertEquals(36, counter.count());
        counter.add(34, 46);
        counter.add(10, 23);
        assertEquals(39, counter.count());
    }
}