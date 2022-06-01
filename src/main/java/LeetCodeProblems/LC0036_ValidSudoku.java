package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class LC0036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char v = board[i][j];
                if (v != '.') {
                    String row = String.format("R%d=%s", i, v);
                    String col = String.format("C%d=%s", j, v);
                    String grid = String.format("G%d%d=%s", i / 3, j / 3, v);
                    if (seen.contains(row) || seen.contains(col) || seen.contains(grid)) {
                        return false;
                    }
                    seen.add(row);
                    seen.add(col);
                    seen.add(grid);
                }
            }
        }
        return true;
    }
}
