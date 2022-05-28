package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

public class LC0098_ValidateBinarySearchTree {
    private boolean dfsValidate(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return dfsValidate(root.left, low, root.val) &&
                dfsValidate(root.right, root.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        return dfsValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
