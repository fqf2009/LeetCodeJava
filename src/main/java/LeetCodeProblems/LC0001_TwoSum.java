package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (seen.containsKey(target - nums[i])){
                return new int[]{seen.get(target - nums[i]), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
