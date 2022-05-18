package LeetCodeProblems;

public class LC0050_Pow {
    public double myPow(double x, int n) {
        double prod = x, res = 1.0;
        if (n < 0) {
            x = 1 / x;
            if (n == -2147483648) {     // -2^31
                n = 1073741824;         // 2^30
                prod = x * x;
            } else {
                n = -n;
                prod = x;
            }
        }

        while (n > 0) {
            if (n % 2 == 1) {
                res *= prod;
            }
            n /= 2;
            prod *= prod;
        }
        return res;
    }
}
