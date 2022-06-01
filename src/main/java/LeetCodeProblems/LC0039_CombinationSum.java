package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC0039_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        backtrack(target, 0, candidates, res, comb);
        return res;
    }

    private void backtrack(int remain, int start, int[] cnd,
                           List<List<Integer>> res, List<Integer> comb) {
        if (remain == 0) {
            res.add(List.copyOf(comb));
            return;
        }
        if (remain < 0) return;
        for (int i = start; i < cnd.length; i++) {
            comb.add(cnd[i]);
            backtrack(remain - cnd[i], i, cnd, res, comb);
            comb.remove(comb.size() - 1);
        }
    }
}
