package LeetCodeProblems;

public class LC0035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length;
        while (i < j) {
            int k = (i + j) / 2;
            if (nums[k] < target) {
                i = k + 1;
            } else {
                j = k;
            }
        }
        return i;
    }
}
