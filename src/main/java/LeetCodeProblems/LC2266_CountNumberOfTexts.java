package LeetCodeProblems;

public class LC2266_CountNumberOfTexts {
    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length(), modulo = 1000000007;
        long res = 1;
        int[][] dp = new int[2][n + 4];
        dp[0][0] = dp[1][0] = 1;
        int[] hwm = {0, 0};
        int keyCount = 0;
        for (int i = 0; i < pressedKeys.length(); i++) {
            keyCount++;
            if (i + 1 < pressedKeys.length() && pressedKeys.charAt(i) == pressedKeys.charAt(i + 1)) continue;
            int steps, idx;
            if ("79".indexOf(pressedKeys.charAt(i)) >= 0) {
                steps = 4;
                idx = 1;
            } else {
                steps = 3;
                idx = 0;
            }

            for (int j = hwm[idx]; j < keyCount; j++) {
                for (int k = 1; k < steps + 1; k++) {
                    dp[idx][j + k] = (dp[idx][j + k] + dp[idx][j]) % modulo; // !!!
                }
            }
            res = (res * dp[idx][keyCount]) % modulo;
            hwm[idx] = Integer.max(hwm[idx], keyCount);
            keyCount = 0;
        }
        return (int) res;
    }
}
