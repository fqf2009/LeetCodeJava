package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0047_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(res, perm, nums, used);
        return new ArrayList<>(res);
    }

    private void backtrack(Set<List<Integer>> res, List<Integer> perm,
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
