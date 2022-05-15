package LeetCodeProblems;

import java.util.Arrays;

public class LC2274_MaxConsecutiveFloors {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int n = special.length;
        int res = Integer.max(special[0] - bottom, top - special[n - 1]);
        for (int i = 1; i < special.length; i++) {
            res = Integer.max(res, special[i] - special[i - 1] - 1);
        }
        return res;
    }
}
