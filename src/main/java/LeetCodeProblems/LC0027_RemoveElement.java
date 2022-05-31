package LeetCodeProblems;

public class LC0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                if (i < j) {
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }
}
