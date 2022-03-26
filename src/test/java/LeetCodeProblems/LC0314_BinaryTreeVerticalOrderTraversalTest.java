package LeetCodeProblems;

import LeetCodeCommons.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0314_BinaryTreeVerticalOrderTraversalTest {
    private LC0314_BinaryTreeVerticalOrderTraversal solution;

    @BeforeEach
    void setup() {
        solution = new LC0314_BinaryTreeVerticalOrderTraversal();
    }

    void verticalOrderTest(List<Integer> input, List<List<Integer>> expected) {
        TreeNode root = TreeNode.fromBFSList(input);
        List<List<Integer>> res = solution.verticalOrder(root);
        List<List<Integer>> res1 = solution.verticalOrder(root);
        System.out.println("verticalOrder: " + res.toString());
        System.out.println("verticalOrder1: " + res1.toString());
        assertIterableEquals(expected, res);
        assertIterableEquals(expected, res1);
    }

    @Test
    void verticalOrderTestCase1() {
        List<Integer> input = Arrays.asList(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(9),
                Arrays.asList(3, 15),
                Arrays.asList(20),
                Arrays.asList(7));
        verticalOrderTest(input, expected);
    }

    @Test
    void verticalOrderTestCase2() {
        List<Integer> input = Arrays.asList(3, 9, 8, 4, 0, 1, 7);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(4),
                Arrays.asList(9),
                Arrays.asList(3, 0, 1),
                Arrays.asList(8),
                Arrays.asList(7));
        verticalOrderTest(input, expected);
    }

    @Test
    void verticalOrderTestCase3() {
        List<Integer> input = Arrays.asList(3, 9, 8, 4, 0, 1, 7, null, null, null, 2, 5);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(4),
                Arrays.asList(9, 5),
                Arrays.asList(3, 0, 1),
                Arrays.asList(8, 2),
                Arrays.asList(7));
        verticalOrderTest(input, expected);
    }
}
