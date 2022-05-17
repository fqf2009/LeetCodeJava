package LeetCodeProblems;

import LeetCodeCommons.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0236_LowestCommonAncestorOfBinaryTreeTest {
    private LC0236_LowestCommonAncestorOfBinaryTree sol;

    @BeforeEach
    void setUp() {
        sol = new LC0236_LowestCommonAncestorOfBinaryTree();
    }

    void lowestCommonAncestorTest(List<Integer> input, int v1, int v2, int expected) {
        TreeNode root = TreeNode.fromBFSList(input);
        TreeNode p = TreeNode.findNode(root, v1);
        TreeNode q = TreeNode.findNode(root, v2);
        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
        assertEquals(expected, lca.val);
    }

    @Test
    void lowestCommonAncestorTest1() {
        List<Integer> input = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        lowestCommonAncestorTest(input, 5, 1, 3);
    }

    @Test
    void lowestCommonAncestorTest2() {
        List<Integer> input = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        lowestCommonAncestorTest(input, 5, 4, 5);
    }

    @Test
    void lowestCommonAncestorTest3() {
        List<Integer> input = Arrays.asList(1, 2);
        lowestCommonAncestorTest(input, 1, 2, 1);
    }
}