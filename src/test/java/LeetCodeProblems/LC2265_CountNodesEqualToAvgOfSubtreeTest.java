package LeetCodeProblems;

import LeetCodeCommons.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC2265_CountNodesEqualToAvgOfSubtreeTest {
    private LC2265_CountNodesEqualToAvgOfSubtree solution;

    @BeforeEach
    void setUp() {
        solution = new LC2265_CountNodesEqualToAvgOfSubtree();
    }

    void averageOfSubtreeTest(List<Integer> input, int expected) {
        TreeNode root = TreeNode.fromBFSList(input);
        assertEquals(expected, solution.averageOfSubtree(root));
    }

    @Test
    void averageOfSubtreeTest1() {
        List<Integer> input = Arrays.asList(4, 8, 5, 0, 1, null, 6);
        averageOfSubtreeTest(input, 5);
    }

    @Test
    void averageOfSubtreeTest2() {
        List<Integer> input = List.of(1);
        averageOfSubtreeTest(input, 1);
    }
}