package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC0102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> dq = new ArrayDeque<>();
            dq.addLast(root);
            while (dq.size() > 0) {
                int n = dq.size();
                List<Integer> values = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode node = dq.pollFirst();
                    values.add(node.val);
                    if (node.left != null) dq.addLast(node.left);
                    if (node.right != null) dq.addLast(node.right);
                }
                res.add(values);
            }
        }
        return res;
    }
}
