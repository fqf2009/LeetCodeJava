package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC0079_WordSearch {
    public boolean exist(char[][] board, String word) {
        Map<Character, Integer> counterWord = new HashMap<>();
        Map<Character, Integer> counterBoard = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int freq = counterWord.getOrDefault(ch, 0) + 1;
            counterWord.put(ch, freq);
        }

        for (char[] chars : board) {
            for (int i = 0; i < board[0].length; i++) {
                char ch = chars[i];
                int freq = counterBoard.getOrDefault(ch, 0) + 1;
                counterBoard.put(ch, freq);
            }
        }

        // pruning
        for (var e : counterWord.entrySet()) {
            if (counterBoard.getOrDefault(e.getKey(), 0) < e.getValue()) {
                return false;
            }
        }
        if (counterWord.get(word.charAt(0)) > counterWord.get(word.charAt(word.length() - 1))) {
            word = new StringBuilder(word).reverse().toString();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs_backtrack(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs_backtrack(char[][] board, String word, int i, int j, int p) {
        if (p == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != word.charAt(p))
            return false;
        board[i][j] = '*'; // mark already in the path
        boolean res = dfs_backtrack(board, word, i + 1, j, p + 1) ||
                dfs_backtrack(board, word, i - 1, j, p + 1) ||
                dfs_backtrack(board, word, i, j + 1, p + 1) ||
                dfs_backtrack(board, word, i, j - 1, p + 1);
        board[i][j] = word.charAt(p);  // restore
        return res;
    }
}