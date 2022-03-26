package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC1570_DotProductOfTwoSparseVectorsTest {
    void dotProductTest(int[] nums1, int[] nums2, int expected) {
        LC1570_DotProductOfTwoSparseVectors v1 = new LC1570_DotProductOfTwoSparseVectors(nums1);
        LC1570_DotProductOfTwoSparseVectors v2 = new LC1570_DotProductOfTwoSparseVectors(nums2);
        int ans = v1.dotProduct(v2);
        System.out.println(ans);
        assertEquals(expected, ans);
    }

    @Test
    void dotProductTestCase1() {
        int[] nums1 = {1, 0, 0, 2, 3};
        int[] nums2 = {0, 3, 0, 4, 0};
        dotProductTest(nums1, nums2, 8);
    }

    @Test
    void dotProductTestCase2() {
        int[] nums1 = {0, 1, 0, 0, 0};
        int[] nums2 = {0, 0, 0, 0, 2};
        dotProductTest(nums1, nums2, 0);
    }

    @Test
    void dotProductTestCase3() {
        int[] nums1 = {0, 1, 0, 0, 2, 0, 0};
        int[] nums2 = {1, 0, 0, 0, 3, 0, 4};
        dotProductTest(nums1, nums2, 6);
    }

}
