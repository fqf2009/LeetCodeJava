package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0046_PermutationsTest {
    private LC0046_Permutations sol;

    @BeforeEach
    void setUp() {
        sol = new LC0046_Permutations();
    }

    @Test
    void permute1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3),
                List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        assertIterableEquals(expected, sol.permute(nums));
    }

    @Test
    void permute2() {
        int[] nums = {0, 1};
        List<List<Integer>> expected = List.of(
                List.of(0, 1), List.of(1, 0));
        assertIterableEquals(expected, sol.permute(nums));
    }

    @Test
    void permute3() {
        int[] nums = {1};
        List<List<Integer>> expected = List.of(List.of(1));
        assertIterableEquals(expected, sol.permute(nums));
    }
}