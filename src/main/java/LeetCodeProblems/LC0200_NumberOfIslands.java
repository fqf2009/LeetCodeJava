package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC0200_NumberOfIslands {
    // BFS - T/S: O(m*n), O(m+n)
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[m][n];
        int[][] deltas = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '1' || visited[i][j]) continue;
                islands += 1;
                visited[i][j] = true;
                queue.add(new int[]{i, j});
                while (!queue.isEmpty()) {
                    int[] pos = queue.remove();
                    for (int[] dlt : deltas) {
                        int x = pos[0] + dlt[0];
                        int y = pos[1] + dlt[1];
                        if (x >= 0 && x < m && y >= 0 && y < n &&
                                grid[x][y] == '1' && !visited[x][y]) {
                            visited[x][y] = true;
                            queue.add(new int[]{x, y});
                        }
                    }
                }
            }
        }
        return islands;
    }

    //DFS - T/S: O(m*n), O(k), where k is largest island size
    public int numIslands1(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs_visit(grid, m, n, i, j);
                }
            }
        }
        return islands;
    }

    // DFS - recursive helper
    private void dfs_visit(char[][] grid, int m, int n, int i, int j) {
        int[][] deltas = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        grid[i][j] = '2';
        for (int[] dlt : deltas) {
            int x = i + dlt[0];
            int y = j + dlt[1];
            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
                dfs_visit(grid, m, n, x, y);
            }
        }
    }
}