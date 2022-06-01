package LeetCodeProblems;

public class LC0034_SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = {-1, -1};
        if (n == 0) return res;

        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }

        if (nums[lo] != target)
            return res;

        res[0] = lo;
        hi = n;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] <= target)
                lo = mid + 1;
            else
                hi = mid;
        }
        res[1] = lo - 1;
        return res;
    }
}
