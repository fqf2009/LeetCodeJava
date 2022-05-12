package LeetCodeProblems;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LC0004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A, B;
        if (nums1.length <= nums2.length) {
            A = nums1;
            B = nums2;
        } else {
            A = nums2;
            B = nums1;
        }

        int total_cnt = A.length + B.length;
        int i = 0;
        int j = A.length - 1;
        while (true) {
            // (-1 + 0) / 2 == 0, why is it -1 in Python?
            // Although here is not about rounding, (here is about discard decimal portion)
            // Below is the similar behavior which Java and Python handle differently:
            // Java is always rounding up while Python rounds down for negative numbers.
            // https://stackoverflow.com/questions/28010108/python-style-round-in-java
            int k1 = j < 0 ? -1 : (i + j) / 2;
            int k2 = total_cnt / 2 - (k1 + 1) - 1;
            double al = k1 >= 0 ? A[k1] : Double.NEGATIVE_INFINITY;
            double ar = k1 + 1 < A.length ? A[k1 + 1] : Double.POSITIVE_INFINITY;
            double bl = k2 >= 0 ? B[k2] : Double.NEGATIVE_INFINITY;
            double br = k2 + 1 < B.length ? B[k2 + 1] : Double.POSITIVE_INFINITY;
            if (al <= br && bl <= ar) {
                if (total_cnt % 2 == 0) {
                    return (max(al, bl) + min(ar, br)) / 2;
                } else {
                    return min(ar, br);
                }
            } else if (al > br) {
                j = k1 - 1;
            } else {
                i = k1 + 1;
            }
        }
    }
}
