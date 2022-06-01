package LeetCodeProblems;

public class LC0043_MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] prod = new int[m + n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = num1.charAt(m - 1 - i) - '0', b = num2.charAt(n - 1 - j) - '0';
                int mul = a * b;
                int k = i + j;
                while (mul > 0) {
                    mul += prod[k];
                    prod[k] = mul % 10;
                    mul /= 10;
                    k++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int i = prod.length - 1; i >= 0; i--) {
            if (!leadingZero || prod[i] > 0) {
                leadingZero = false;
                sb.append(prod[i]);
            }
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }

    // wrong - overflow
    // public String multiply(String num1, String num2) {
    //     return String.valueOf(Long.valueOf(num1) * Long.valueOf(num2));
    // }
}
