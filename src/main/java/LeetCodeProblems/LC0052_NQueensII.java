package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0052_NQueensII {
    public int totalNQueens(int n) {
        int[] pos = new int[n];
        Set<Integer> cols = new HashSet<>(); // filled columns
        return backtrack(0, pos, cols, 0);
    }

    private int backtrack(int row, int[] pos, Set<Integer> cols, int cnt) {
        if (row == pos.length) {
            return cnt + 1;
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
            cnt = backtrack(row + 1, pos, cols, cnt);
            cols.remove(j);
        }
        return cnt;
    }
}
