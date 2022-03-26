package LeetCodeProblems;

import LeetCodeCommons.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0938_RangeSumOfBSTTest {
    private LC0938_RangeSumOfBST solution;

    @BeforeEach
    void setup() {
        solution = new LC0938_RangeSumOfBST();
    }

    void rangeSumBSTTest(List<Integer> input, int low, int high, int expected) {
        TreeNode root = TreeNode.fromBFSList(input);
        int ans = solution.rangeSumBST(root, low, high);
        System.out.println(ans);
        assertEquals(expected, ans);
    }

    @Test
    void rangeSumBSTTestCase1() {
        List<Integer> input = Arrays.asList(10, 5, 15, 3, 7, null, 18);
        rangeSumBSTTest(input, 7, 15, 32);
    }

    @Test
    void rangeSumBSTTestCase2() {
        List<Integer> input = Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6);
        rangeSumBSTTest(input, 6, 10, 23);
    }
}