package LeetCodeProblems;

import LeetCodeCommons.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC1650_LowestCommonAncestorOfBinaryTreeIIITest {
    private LC1650_LowestCommonAncestorOfBinaryTreeIII solution;

    @BeforeEach
    void setup() {
        solution = new LC1650_LowestCommonAncestorOfBinaryTreeIII();
    }

    void lowestCommonAncestorTest(List<Integer> input, int v1, int v2, int expected) {
        TreeNode root = TreeNode.fromBFSList(input);
        TreeNode node1 = TreeNode.findNode(root, v1);
        TreeNode node2 = TreeNode.findNode(root, v2);
        TreeNode ans = solution.lowestCommonAncestor(node1, node2);
        assertEquals(expected, ans.val);
    }

    @Test
    void lowestCommonAncestorTestCase1() {
        List<Integer> input = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        lowestCommonAncestorTest(input, 5, 1, 3);
    }

    @Test
    void lowestCommonAncestorTestCase2() {
        List<Integer> input = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        lowestCommonAncestorTest(input, 5, 4, 5);
    }

    @Test
    void lowestCommonAncestorTestCase3() {
        List<Integer> input = Arrays.asList(1, 2);
        lowestCommonAncestorTest(input, 1, 2, 1);
    }
}