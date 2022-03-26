package LeetCodeProblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC1570_DotProductOfTwoSparseVectors {
    private Map<Integer, Integer> map;

    LC1570_DotProductOfTwoSparseVectors(int[] nums) {
        map = IntStream.range(0, nums.length).boxed()
                .filter(i -> nums[i] > 0)
                .collect(Collectors.toMap(Function.identity(), i -> nums[i]));
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(LC1570_DotProductOfTwoSparseVectors vec) {
        Map<Integer, Integer> map1, map2;
        if (this.map.size() > vec.map.size()) {
            map1 = vec.getMap();
            map2 = this.map;
        } else {
            map2 = vec.getMap();
            map1 = this.map;
        }

        return map1.entrySet().stream().mapToInt(entry ->
                entry.getValue() * map2.getOrDefault(entry.getKey(), 0)).sum();
    }
}
