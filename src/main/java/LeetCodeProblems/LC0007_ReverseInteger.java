package LeetCodeProblems;

public class LC0007_ReverseInteger {
    // divide/mod on negative int: Python is different from Java
    // Python: -123 // 10 == -13, -123 % 10 == 7
    // Java:   -123 // 10 == -12, -123 % 10 == -3
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int res1 = res * 10 + x % 10;
            if (res1 / 10 != res) return 0; // detect int overflow
            res = res1;
            x /= 10;
        }
        return res;
    }
}
