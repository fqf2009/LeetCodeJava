package LeetCodeProblems;

public class LC1567_MaxLengthOfSubarrayWithPositiveProduct {
    public int getMaxLen(int[] nums) {
        int res = 0, pos = 0, neg = 0;
        for (var v : nums) {
            if (v > 0) {
                pos++;
                neg += neg > 0 ? 1 : 0;
            } else if (v < 0) {
                int prevPos = pos;
                pos = neg > 0 ? neg + 1 : 0;
                neg = prevPos + 1;
            } else {
                pos = 0;
                neg = 0;
            }
            res = Integer.max(res, pos);
        }
        return res;
    }
}
