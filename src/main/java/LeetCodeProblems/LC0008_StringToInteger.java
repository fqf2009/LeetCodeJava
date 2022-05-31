package LeetCodeProblems;

public class LC0008_StringToInteger {
    public int myAtoi(String s) {
        int i = 0, sign = 1, res = 0, n = s.length();
        // skip leading space
        while (i < n && s.charAt(i) == ' ')
            i++;

        // sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // convert to int and avoid overflow
        while (i < n) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9) break;

            int res1 = res * 10 + digit;
            if (res1 / 10 != res)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res1;
            i++;
        }
        return sign * res;
    }
}
