package LeetCodeProblems;

public class LC0031_NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int k = n - 1;
                for (int j = n - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        k = j;
                        break;
                    }
                }
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                p = i + 1;
                break;
            }
        }

        for (int i = p; i < p + (n - p) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - (i - p)];
            nums[n - 1 - (i - p)] = temp;
        }
    }
}
