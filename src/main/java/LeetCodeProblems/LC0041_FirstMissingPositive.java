package LeetCodeProblems;

public class LC0041_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i], j = i;
            while (v >= 1 && v <= nums.length && v != j + 1) {
                j = v - 1;
                int v1 = nums[j];
                nums[j] = v;
                v = v1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;
    }
}
