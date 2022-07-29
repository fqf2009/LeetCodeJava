package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC1730_ShortestPathToGetFood {
    public int getFood(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    deque.addLast(new int[]{i, j, 0});
                }
            }
        }

        int[][] deltas = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!deque.isEmpty()) {
            int[] pos = deque.poll();
            int steps = pos[2];
            for (var delta : deltas) {
                int i = pos[0] + delta[0], j = pos[1] + delta[1];
                if (i >= 0 && i < m && j >= 0 && j < n) {
                    if (grid[i][j] == '#') {
                        return steps + 1;
                    } else if (grid[i][j] == 'O') {
                        grid[i][j] = '.';    // mark visited
                        deque.addLast(new int[]{i, j, steps + 1});
                    }
                }
            }
        }

        // restore grid if necessary
        return -1;
    }
}
