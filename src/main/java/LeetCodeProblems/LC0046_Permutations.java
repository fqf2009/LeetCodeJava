package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC0046_Permutations {
    // nums are unique
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(res, perm, nums, used);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> perm,
                           int[] nums, boolean[] used) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm.add(nums[i]);
                backtrack(res, perm, nums, used);
                perm.remove(perm.size() - 1);
                used[i] = false;
            }
        }
    }
}
