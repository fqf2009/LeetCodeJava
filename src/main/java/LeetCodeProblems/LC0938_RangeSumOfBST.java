package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

public class LC0938_RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int leftSum = root.val > low ? rangeSumBST(root.left, low, high) : 0;
        int rightSum = root.val < high ? rangeSumBST(root.right, low, high) : 0;
        int midVal = low <= root.val && root.val <= high ? root.val : 0;

        return leftSum + midVal + rightSum;
    }
}
