package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC0057_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] > newInterval[0]) break;
            res.add(interval);
        }
        int moved = res.size();

        if (res.size() > 0 && newInterval[0] <= res.get(res.size() - 1)[1]) {
            res.get(res.size() - 1)[1] = Integer.max(res.get(res.size() - 1)[1], newInterval[1]);
        } else {
            res.add(newInterval);
        }

        for (int i = moved; i < intervals.length; i++) {
            if (res.size() > 0 && intervals[i][0] <= res.get(res.size() - 1)[1]) {
                res.get(res.size() - 1)[1] = Integer.max(res.get(res.size() - 1)[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }

        int[][] res1 = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            res1[i][0] = res.get(i)[0];
            res1[i][1] = res.get(i)[1];
        }
        return res1;
    }
}
