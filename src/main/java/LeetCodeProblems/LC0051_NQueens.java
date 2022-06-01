package LeetCodeProblems;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0051_NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] pos = new int[n];
        Set<Integer> cols = new HashSet<>(); // filled columns
        backtrack(0, pos, cols, res);
        return res;
    }

    private void backtrack(int row, int[] pos, Set<Integer> cols, List<List<String>> res) {
        if (row == pos.length) {
            List<String> solution = new ArrayList<>();
            for (var p : pos) {
                StringBuilder line = new StringBuilder();
                for (int i = 0; i < pos.length; i++) {
                    line.append(p == i ? "Q" : ".");
                }
                solution.add(line.toString());
            }
            res.add(solution);
            return;
        }

        for (int j = 0; j < pos.length; j++) {
            if (cols.contains(j)) continue;
            boolean valid = true;
            for (int k = 0; k < row; k++) {
                if (Math.abs(j - pos[k]) == row - k) {
                    valid = false;
                    break;
                }
            }
            if (!valid) continue;
            pos[row] = j;
            cols.add(j);
            backtrack(row + 1, pos, cols, res);
            cols.remove(j);
        }
    }
}
