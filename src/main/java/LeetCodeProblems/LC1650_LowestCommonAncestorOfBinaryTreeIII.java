package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

public class LC1650_LowestCommonAncestorOfBinaryTreeIII {
    public int levelOfNode(TreeNode node) {
        int level = 0;
        while (node != null) {
            node = node.parent;
            level++;
        }
        return level;
    }

    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        int level1 = levelOfNode(p);
        int level2 = levelOfNode(q);
        TreeNode node1, node2;
        while (level1 != level2) {
            if (level1 < level2) {
                q = q.parent;
                level2--;
            } else {
                p = p.parent;
                level1--;
            }
        }
        while (p != null && q != null && p.val != q.val) {
            p = p.parent;
            q = q.parent;
        }

        return q;
    }
}
