package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

public class LC2265_CountNodesEqualToAvgOfSubtree {
    private int nodes;

    private int[] count(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] a1 = count(node.left);
        int[] a2 = count(node.right);
        int total = a1[0] + a2[0] + node.val;
        int cnt = a1[1] + a2[1] + 1;
        if (total / cnt == node.val) {
            nodes++;
        }
        return new int[]{total, cnt};
    }

    public int averageOfSubtree(TreeNode root) {
        nodes = 0;
        count(root);
        return nodes;
    }
}
