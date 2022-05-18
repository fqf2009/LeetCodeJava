package LeetCodeProblems;

import java.util.*;

public class LC0015_ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;    // skip duplicates
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    // skip duplicates
                    if (res.size() == 0 || !res.get(res.size() - 1).equals(triplet)) {
                        res.add(triplet);
                    }
                    j++;
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }


    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        // deduplicate afterwards
        Set<String> keys = new HashSet<>();
        for (var iter = res.iterator(); iter.hasNext(); ) {
            List<Integer> list = iter.next();
            String key = list.toString();
            if (keys.contains(key)) {
                iter.remove();
            } else {
                keys.add(key);
            }
        }
        return res;
    }
}
