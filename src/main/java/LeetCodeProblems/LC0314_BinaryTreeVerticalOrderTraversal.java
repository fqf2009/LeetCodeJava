package LeetCodeProblems;

import LeetCodeCommons.TreeNode;

import java.util.*;

// BFS: T/S: O(n), O(n)
public class LC0314_BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        Queue<TreeNode> que = new ArrayDeque<>();
        Queue<Integer> cols = new ArrayDeque<>();
        que.add(root);
        cols.add(0);
        Deque<List<Integer>> res = new ArrayDeque<>();
        int leftCol = 0;

        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            int col = cols.poll();
            if (col < leftCol) {
                res.addFirst(new ArrayList<>());
                leftCol--;
            } else if (col >= res.size() + leftCol) {
                res.addLast(new ArrayList<>());
            }
            List<Integer> lst = (List<Integer>) (res.toArray()[col - leftCol]);
            lst.add(node.val);

            if (node.left != null) {
                que.add(node.left);
                cols.add(col - 1);
            }
            if (node.right != null) {
                que.add(node.right);
                cols.add(col + 1);
            }
        }

        return res.stream().toList();
    }

    public List<List<Integer>> verticalOrder1(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        Queue<TreeNode> que = new ArrayDeque<>();
        Queue<Integer> cols = new ArrayDeque<>();
        que.add(root);
        cols.add(0);
        Map<Integer, List<Integer>> map = new HashMap<>();
        int leftIdx = 0, rightIdx = 0;

        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            int col = cols.poll();
            leftIdx = Math.min(leftIdx, col);
            rightIdx = Math.max(rightIdx, col);

            if (!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(node.val);

            if (node.left != null) {
                que.add(node.left);
                cols.add(col - 1);
            }

            if (node.right != null) {
                que.add(node.right);
                cols.add(col + 1);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = leftIdx; i <= rightIdx; i++) {
            res.add(map.get(i));
        }

        return res;
    }
}