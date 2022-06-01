package LeetCodeProblems;

public class LC0032_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        return Integer.max(maxMatched(s, true), maxMatched(s, false));
    }

    private int maxMatched(String s, boolean ltr) {
        int maxLen = 0, left = 0, right = 0;
        char leftPar = ltr ? '(' : ')';
        if (!ltr) s = new StringBuilder(s).reverse().toString();
        for (var ch : s.toCharArray()) {
            if (ch == leftPar)
                left++;
            else
                right++;
            if (left == right)
                maxLen = Integer.max(maxLen, left * 2);
            else if (left < right)
                left = right = 0;
        }
        return maxLen;
    }
}
