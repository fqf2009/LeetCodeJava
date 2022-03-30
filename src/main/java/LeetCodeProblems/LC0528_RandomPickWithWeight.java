package LeetCodeProblems;

import java.util.Random;

public class LC0528_RandomPickWithWeight {
    private final double[] weights;
    private final Random rand;

    public LC0528_RandomPickWithWeight(int[] w) {
        rand = new Random();
        weights = new double[w.length];
        double totalWeight = 0.0;
        for (int i = 0; i < w.length; i++) {
            totalWeight += w[i];
            weights[i] = totalWeight;
        }
    }

    public int pickIndex() {
        double r = rand.nextDouble() * weights[weights.length - 1];
        int i = 0, j = weights.length - 1;
        while (i < j) {
            int k = (i + j) / 2;
            if (r > weights[k]) {
                i = k + 1;
            } else {
                j = k;
            }
        }
        return i;
    }
}
