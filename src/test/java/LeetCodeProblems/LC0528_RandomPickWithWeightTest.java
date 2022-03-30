package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0528_RandomPickWithWeightTest {
    void pickIndexTest(int[] w, int calls) {
        LC0528_RandomPickWithWeight solution = new LC0528_RandomPickWithWeight(w);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < calls; i++) {
            ans.add(solution.pickIndex());
        }
        System.out.println(ans);
    }

    @Test
    void pickIndexTestCase1() {
        int[] w = {1};
        pickIndexTest(w, 1);
    }

    @Test
    void pickIndexTestCase2() {
        int[] w = {1, 3};
        pickIndexTest(w, 5);
    }

    @Test
    void pickIndexTestCase3() {
        int[] w = {3, 14, 1, 7};
        pickIndexTest(w, 25);
    }
}