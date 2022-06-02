package LeetCodeProblems;

public class LC0059_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int i = 0, j = -1, r = n, c = n, delta = 1, v = 0;
        int[][] res = new int[n][n];
        while (r * c > 0) {
            for (int k = 0; k < c; k++) {
                j += delta;
                v++;
                res[i][j] = v;
            }
            r--;
            for (int k = 0; k < r; k++) {
                i += delta;
                v++;
                res[i][j] = v;
            }
            c--;
            delta *= -1;
        }
        return res;
    }
}
