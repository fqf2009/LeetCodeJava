package LeetCodeProblems;

public class LC0029_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend), b = Math.abs((long) divisor);
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (a >> i >= b) {  // a >= (b << i) will lead to int overflow
                res += (1 << i);
                a -= (b << i);
            }
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
