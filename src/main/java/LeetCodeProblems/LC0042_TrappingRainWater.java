package LeetCodeProblems;

import java.util.stream.IntStream;

class LC0042_TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftWall = new int[n];
        int[] rightWall = new int[n];
        leftWall[0] = height[0];
        rightWall[n - 1] = height[n - 1];

        for (int i = 1; i < n - 1; i++) {
            leftWall[i] = Math.max(leftWall[i - 1], height[i]);
            rightWall[n - 1 - i] = Math.max(rightWall[n - i], height[n - i - 1]);
        }

        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int wall = Math.min(leftWall[i], rightWall[i]);
            res += Math.max(wall - height[i], 0);
        }

        return res;
    }
}

class LC0042_TrappingRainWater1 {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftWall = new int[n];
        int[] rightWall = new int[n];
        leftWall[0] = height[0];
        rightWall[n - 1] = height[n - 1];

        for (int i = 1; i < n - 1; i++) {
            leftWall[i] = Math.max(leftWall[i - 1], height[i]);
            rightWall[n - 1 - i] = Math.max(rightWall[n - i], height[n - i - 1]);
        }

        return IntStream.range(0, n).map(i ->
                Math.max(Math.min(leftWall[i], rightWall[i]) - height[i], 0)).sum();
    }
}