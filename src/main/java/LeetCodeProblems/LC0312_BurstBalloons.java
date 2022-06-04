package LeetCodeProblems;

import java.util.Arrays;

public class LC0312_BurstBalloons {
    private int maxCoins(int l, int r, int[] nums, int[][] dp) {
        if (l > r) return 0;
        if (dp[l][r] >= 0) return dp[l][r];
        int v1 = l > 0 ? nums[l - 1] : 1;
        int v2 = r + 1 < nums.length ? nums[r + 1] : 1;
        int res = 0;
        for (int i = l; i <= r; i++) {
            res = Integer.max(res, maxCoins(l, i - 1, nums, dp) +
                    maxCoins(i + 1, r, nums, dp) + v1 * v2 * nums[i]);
        }
        dp[l][r] = res;
        return res;
    }

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return maxCoins(0, n - 1, nums, dp);
    }
}
