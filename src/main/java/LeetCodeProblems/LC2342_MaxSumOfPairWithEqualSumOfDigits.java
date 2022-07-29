package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC2342_MaxSumOfPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;

        for (var v : nums) {
            int ds = 0, v1 = v;
            while (v1 > 0) {
                ds += v1 % 10;
                v1 /= 10;
            }
            if (map.containsKey(ds)) {
                res = Integer.max(res, map.get(ds) + v);
                map.put(ds, Integer.max(v, map.get(ds)));
            } else {
                map.put(ds, v);
            }
        }

        return res;
    }
}
