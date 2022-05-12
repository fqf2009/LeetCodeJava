package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0004_MedianOfTwoSortedArraysTest {
    private LC0004_MedianOfTwoSortedArrays solution;

    @BeforeEach
    void setUp() {
        solution = new LC0004_MedianOfTwoSortedArrays();
    }

    void findMedianSortedArraysTest(int[] nums1, int[] nums2, double expected) {
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
        assertEquals(expected, median);
    }

    @Test
    void findMedianSortedArraysTest1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double expected = 2.0;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }

    @Test
    void findMedianSortedArraysTest2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double expected = 2.5;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }

    @Test
    void findMedianSortedArraysTest3() {
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{0, 0};
        double expected = 0.0;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }

    @Test
    void findMedianSortedArraysTest4() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};
        double expected = 1.0;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }

    @Test
    void findMedianSortedArraysTest5() {
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{};
        double expected = 2.0;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }

    @Test
    void findMedianSortedArraysTest6() {
        int[] nums1 = new int[]{1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] nums2 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 7, 7, 7, 7, 7, 7, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        double expected = 7.0;
        findMedianSortedArraysTest(nums1, nums2, expected);
    }
}