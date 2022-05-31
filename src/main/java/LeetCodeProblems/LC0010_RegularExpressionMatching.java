package LeetCodeProblems;

public class LC0010_RegularExpressionMatching {
    // match on remaining portion
    // i, j are pos index to s and p
    private boolean match(String s, String p, int i, int j, int[][] dp) {
        if (j == p.length()) return i == s.length();
        if (dp[i][j] >= 0) return dp[i][j] != 0;

        boolean first_char_match = i < s.length() &&
                (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');
        boolean res;
        if (j + 1 < p.length() && p.charAt(j + 1) == '*')
            res = match(s, p, i, j + 2, dp) || first_char_match && match(s, p, i + 1, j, dp);
        else
            res = first_char_match && match(s, p, i + 1, j + 1, dp);

        // cache/memo to eliminate duplicated calculation
        dp[i][j] = res ? 1 : 0;
        return res;
    }

    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length() + 1][p.length() + 1];
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < p.length() + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return match(s, p, 0, 0, dp);
    }
}
