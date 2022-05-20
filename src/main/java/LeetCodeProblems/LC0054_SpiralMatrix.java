package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int step = 1;
        int i = 0, j = -1; // current pos
        List<Integer> res = new ArrayList<>();
        while (m * n > 0) {
            for (int k = 0; k < n; k++) {
                j += step;
                res.add(matrix[i][j]);
            }
            m -= 1;
            for (int k = 0; k < m; k++) {
                i += step;
                res.add(matrix[i][j]);
            }
            n -= 1;
            step *= -1;
        }
        return res;
    }
}
