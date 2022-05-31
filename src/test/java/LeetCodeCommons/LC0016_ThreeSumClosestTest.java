package LeetCodeCommons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0016_ThreeSumClosestTest {

    @Test
    void threeSumClosest() {
        LC0016_ThreeSumClosest sol = new LC0016_ThreeSumClosest();
        assertEquals(2, sol.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(0, sol.threeSumClosest(new int[]{0, 0, 0}, 1));
    }
}