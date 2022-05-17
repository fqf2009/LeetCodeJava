package LeetCodeProblems;

public class LC0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int min_pfx_sum = 0, pfx_sum = 0, res = nums[0];
        for (int v : nums) {
            pfx_sum += v;
            res = Integer.max(res, pfx_sum - min_pfx_sum);
            min_pfx_sum = Integer.min(min_pfx_sum, pfx_sum);
        }
        return res;
    }
}
