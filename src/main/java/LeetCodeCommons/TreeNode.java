package LeetCodeCommons;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent; // for LC1650

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode parent) {
        this.val = val;
        this.parent = parent;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public static TreeNode fromBFSList(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }

        TreeNode root = new TreeNode(list.get(0));
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        boolean isLeft = true;

        for (int i = 1; i < list.size(); i++) {
            Integer value = list.get(i);
            TreeNode node = que.peek();
            if (isLeft) {
                if (value != null) {
                    node.left = new TreeNode(value, node);
                    que.add(node.left);
                }
                isLeft = false;
            } else {
                if (value != null) {
                    node.right = new TreeNode(value, node);
                    que.add(node.right);
                }
                isLeft = true;
                que.poll();
            }
        }

        return root;
    }

    public static List<Integer> toBFSList(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        res.add(root.val);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            if (node.left != null) {
                que.add(node.left);
                res.add(node.left.val);
            } else {
                res.add(null);
            }

            if (node.right != null) {
                que.add(node.right);
                res.add(node.right.val);
            } else {
                res.add(null);
            }
        }

        // remove trailing nulls
        for (int i = res.size() - 1; i >= 0; i--) {
            if (res.get(i) != null) {
                break;
            }
            res.remove(i);
        }

        return res;
    }

    public static TreeNode findNode(TreeNode root, int value) {
        if (root == null) {
            return null;
        } else if (root.val == value) {
            return root;
        }

        TreeNode node = findNode(root.left, value);
        return node != null ? node : findNode(root.right, value);
    }
}