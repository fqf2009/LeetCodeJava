package LeetCodeProblems;

public class LC0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int v = x;
        if (v < 0) return false;
        int rev = 0;
        while (v > 0) {
            int rev1 = rev * 10 + v % 10;
            if (rev1 / 10 != rev)   // overflow
                return false;
            rev = rev1;
            v /= 10;
        }
        return rev == x;
    }
}
