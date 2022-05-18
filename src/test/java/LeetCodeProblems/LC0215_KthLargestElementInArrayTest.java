package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0215_KthLargestElementInArrayTest {
    private LC0215_KthLargestElementInArray sol;

    @BeforeEach
    void setUp() {
        sol = new LC0215_KthLargestElementInArray();
    }

    @Test
    void findKthLargest1() {
        assertEquals(5, sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void findKthLargest2() {
        assertEquals(4, sol.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}