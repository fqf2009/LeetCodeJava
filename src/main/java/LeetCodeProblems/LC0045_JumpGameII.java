package LeetCodeProblems;

public class LC0045_JumpGameII {
    // DP
    public int jump(int[] nums) {
        int steps = 0, curDist = 0, nextDist = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextDist = Integer.max(nextDist, i + nums[i]);
            if (i > curDist) {
                return -1;
            } else if (i == curDist) {
                steps += 1;
                curDist = nextDist;
            }
        }
        return steps;
    }

    public int jump1(int[] nums) {
        if (nums.length == 1) return 0;
        int steps = -1, curDist = -1, nextDist = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > curDist && i <= nextDist) {
                steps += 1;
                curDist = nextDist;
            } else if (i > nextDist) {
                break;
            }

            nextDist = Integer.max(nextDist, i + nums[i]);
            if (nextDist >= nums.length - 1) {
                return steps + 1;
            }
        }
        return -1;
    }

}
