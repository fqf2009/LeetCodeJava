package LeetCodeProblems;

public class LC2267_CheckValidParenthesesStringPath {
    private boolean[][][] visited;

    private boolean dfs(char[][] grid, int m, int n, int i, int j, int delta) {
        if (i == m || j == n) return false;
        delta += grid[i][j] == '(' ? 1 : -1;
        if (delta < 0 || delta > (m + n) / 2 || visited[i][j][delta])
            return false;
        visited[i][j][delta] = true;
        if (i == m - 1 && j == n - 1)
            return delta == 0;
        return dfs(grid, m, n, i + 1, j, delta) || dfs(grid, m, n, i, j + 1, delta);
    }

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        if ((m + n) % 2 == 0 || grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
            return false;
        visited = new boolean[m][n][m + n];
        return dfs(grid, m, n, 0, 0, 0);
    }
}
