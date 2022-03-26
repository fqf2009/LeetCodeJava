package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Monotonic Stack - T/S: O(n)/O(n)
public class LC1762_BuildingsWithOceanView {
    public int[] findBuildings(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i++) {
            while (stack.size() > 0 && heights[stack.peekLast()] <= heights[i]) {
                stack.removeLast();
            }
            stack.addLast(i);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
