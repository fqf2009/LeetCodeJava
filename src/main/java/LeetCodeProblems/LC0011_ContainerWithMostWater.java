package LeetCodeProblems;

public class LC0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = Integer.max(res, Integer.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        return res;
    }
}
