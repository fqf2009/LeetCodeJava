package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC0545_BoundaryOfBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            res.add(root.val);
            leftBoundary(root.left, res);
            leaves(root.left, res);
            leaves(root.right, res);
            rightBoundary(root.right, res);
        }
        return res;
    }

    private void leftBoundary(TreeNode root, List<Integer> res) {
        if (root != null && (root.left != null || root.right != null)) {
            res.add(root.val);          // pre-order
            if (root.left != null)
                leftBoundary(root.left, res);
            else
                leftBoundary(root.right, res);
        }
    }

    private void rightBoundary(TreeNode root, List<Integer> res) {
        if (root != null && (root.left != null || root.right != null)) {
            if (root.right != null)
                rightBoundary(root.right, res);
            else
                rightBoundary(root.left, res);
            res.add(root.val);      // post-order
        }
    }

    private void leaves(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left == null && root.right == null)
                res.add(root.val);
            else {
                leaves(root.left, res);
                leaves(root.right, res);
            }
        }
    }
}
