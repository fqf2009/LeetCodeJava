package LeetCodeProblems;

import java.util.Arrays;

public class LC0016_ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(res - target) > Math.abs(sum - target))
                    res = sum;

                if (sum == target)
                    return target;
                else if (sum < target)
                    j += 1;
                else
                    k -= 1;
            }
        }
        return res;
    }
}
