package LeetCodeProblems;

import java.util.Stack;

// Monotonic stack
class LC0739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] waitDays = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int j = stack.pop();
                waitDays[j] = i - j;
            }
            stack.push(i);
        }
        return waitDays;
    }
}