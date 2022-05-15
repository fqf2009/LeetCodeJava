package LeetCodeProblems;

public class LC2275_LargestCombination {
    public int largestCombination(int[] candidates) {
        int res = 0;
        for (int i = 1; i <= 10000000; i <<= 1) {
            int cur = 0;
            for (int c : candidates) {
                if ((c & i) > 0) {
                    cur++;
                }
            }
            res = Integer.max(res, cur);
        }
        return res;
    }
}
