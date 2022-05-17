package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

public class LC0236_LowestCommonAncestorOfBinaryTree {
    private TreeNode dfsLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode leftLCA = dfsLCA(root.left, p, q);
        TreeNode rightLCA = dfsLCA(root.right, p, q);
        return leftLCA != null && rightLCA != null ? root :
                (leftLCA != null ? leftLCA : rightLCA);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfsLCA(root, p, q);
    }
}
