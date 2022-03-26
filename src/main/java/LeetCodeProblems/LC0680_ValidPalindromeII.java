package LeetCodeProblems;

// T/S: O(n), O(1), even in worst case, because only one char can be deleted
public class LC0680_ValidPalindromeII {
    private boolean validPalindromeWithDelete(String s, int i, int j, boolean del) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return del && (validPalindromeWithDelete(s, i + 1, j, false) ||
                        validPalindromeWithDelete(s, i, j - 1, false));
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        return validPalindromeWithDelete(s, 0, s.length()-1, true);
    }
}
