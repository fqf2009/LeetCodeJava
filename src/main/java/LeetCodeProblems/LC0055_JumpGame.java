package LeetCodeProblems;

public class LC0055_JumpGame {
    public boolean canJump(int[] nums) {
        // DP
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (farthest < i) return false;
            farthest = Integer.max(farthest, i + nums[i]);
            if ((farthest) >= nums.length - 1) return true;
        }

        return false;
    }
}
