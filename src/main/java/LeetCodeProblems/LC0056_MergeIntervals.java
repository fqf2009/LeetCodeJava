package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC0056_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        /*
         all work - 3 comparison methods
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
         Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        */
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        for (int[] itv : intervals) {
            if (ans.size() == 0) {
                ans.add(itv);
            } else {
                int[] itv0 = ans.get(ans.size() - 1);
                if (itv0[1] >= itv[0]) {
                    itv0[1] = Math.max(itv0[1], itv[1]);
                } else {
                    ans.add(itv);
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
