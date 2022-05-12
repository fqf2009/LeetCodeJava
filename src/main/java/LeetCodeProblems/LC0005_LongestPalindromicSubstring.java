package LeetCodeProblems;

public class LC0005_LongestPalindromicSubstring {
    public int longestPalindromeAt(int p1, int p2, String s) {
        int max_len = 0;
        while (p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)) {
            max_len = p2 - p1 + 1;
            p1--;
            p2++;

        }
        return max_len;
    }

    public String longestPalindrome(String s) {
        int max_len = 1;
        int pal_start = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int pal_len = Math.max(longestPalindromeAt(i, i, s), longestPalindromeAt(i, i + 1, s));
            if (max_len < pal_len) {
                max_len = pal_len;
                pal_start = i - (pal_len - 1) / 2;
            }
        }
        return s.substring(pal_start, pal_start + max_len);
    }
}
