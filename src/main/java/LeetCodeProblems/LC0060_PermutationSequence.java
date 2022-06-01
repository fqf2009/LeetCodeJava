package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC0060_PermutationSequence {
    // https://en.wikipedia.org/wiki/Factorial_number_system
    public String getPermutation(int n, int k) {
        List<String> nums = new ArrayList<>();
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            nums.add(String.valueOf(i));
            factorial *= i;
        }

        StringBuilder res = new StringBuilder();
        int v = k - 1;
        for (int i = n; i >= 1; i--) {
            factorial /= i;
            int j = v / factorial;
            v -= j * factorial;
            res.append(nums.get(j));
            nums.remove(j);
        }
        return res.toString();
    }
}
