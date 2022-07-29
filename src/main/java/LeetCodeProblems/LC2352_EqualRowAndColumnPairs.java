package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LC2352_EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowCount = new HashMap<>();
        int n = grid.length;
        for (var row : grid) {
            String key = String.join(",", Arrays.stream(row).boxed().map(Object::toString).toList());
            rowCount.put(key, rowCount.getOrDefault(key, 0) + 1);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {       // column
            StringBuilder key = new StringBuilder();
            for (int j = 0; j < n; j++) {   // row
                key.append(grid[j][i]);
                if (j < n - 1) {
                    key.append(",");
                }
            }
            res += rowCount.getOrDefault(key.toString(), 0);
        }
        return res;
    }

    // slower and consume more memory
    public int equalPairs1(int[][] grid) {
        Map<String, Integer> rowCount = new HashMap<>();
        int n = grid.length;
        for (var row : grid) {
            String key = String.join(",", Arrays.stream(row).boxed().map(Object::toString).toList());
            rowCount.put(key, rowCount.getOrDefault(key, 0) + 1);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {       // column
            final int col = i;  // value used in lambda must be final or effectively final
            String key = String.join(",",
                    IntStream.range(0, n).mapToObj(j -> Integer.toString(grid[j][col])).toList());
            res += rowCount.getOrDefault(key, 0);
        }
        return res;
    }
}