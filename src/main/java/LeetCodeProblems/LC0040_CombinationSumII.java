package LeetCodeProblems;

import java.util.*;

public class LC0040_CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Map<Integer, Integer> counter = new HashMap<>();

        for (int v : candidates) {
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }

        List<Integer> nums = counter.keySet().stream().toList();
        backtrack(target, 0, counter, nums, res, comb);
        return res;
    }

    private void backtrack(int remain, int start,
                           Map<Integer, Integer> counter,
                           List<Integer> nums, List<List<Integer>> res,
                           List<Integer> comb) {
        if (remain == 0) {
            res.add(List.copyOf(comb));
            return;
        }
        if (remain < 0) return;
        for (int i = start; i < nums.size(); i++) {
            int v = nums.get(i);
            if (counter.get(v) > 0) {
                counter.put(v, counter.get(v) - 1);
                comb.add(nums.get(i));
                backtrack(remain - v, i, counter, nums, res, comb);
                comb.remove(comb.size() - 1);
                counter.put(v, counter.get(v) + 1);
            }
        }
    }

    // simplify the code, no need to use counter
    public List<List<Integer>> combinationSum21(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack1(target, 0, candidates, res, comb);
        return res;
    }

    private void backtrack1(int remain, int start, int[] nums,
                            List<List<Integer>> res, List<Integer> comb) {
        if (remain == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }
        if (remain < 0) return;
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
            comb.add(nums[i]);
            backtrack1(remain - nums[i], i + 1, nums, res, comb);
            comb.remove(comb.size() - 1);
        }
    }
}
