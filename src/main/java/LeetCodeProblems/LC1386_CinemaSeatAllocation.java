package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC1386_CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> seats = new HashMap<>();
        for (var rs : reservedSeats) {
            int i = rs[0], j = rs[1], seat = 0;
            if (j >= 2 && j <= 5) seat |= 1;
            if (j >= 4 && j <= 7) seat |= 2;
            if (j >= 6 && j <= 9) seat |= 4;
            if (seat > 0)
                seats.put(i, seats.getOrDefault(i, 0) | seat);
        }

        int res = 2 * n;
        for (var seat : seats.values()) {
            res -= seat == 7 ? 2 : 1;
        }
        return res;
    }
}
