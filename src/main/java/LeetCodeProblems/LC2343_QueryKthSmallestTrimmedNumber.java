package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;

public class LC2343_QueryKthSmallestTrimmedNumber {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        Map<Integer, SimpleEntry<String, Integer>[]> trimmed = new HashMap<>();
        int n = nums.length, m = nums[0].length();
        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0], trim = queries[i][1];
            if (!trimmed.containsKey(trim)) {
                SimpleEntry<String, Integer>[] nums2 = new SimpleEntry[n];
                for (int j = 0; j < n; j++) {
                    nums2[j] = new SimpleEntry<>(nums[j].substring(m - trim), j);
                }
                Arrays.sort(nums2, (a, b) -> a.getKey().equals(b.getKey()) ?
                        a.getValue().compareTo(b.getValue()) : a.getKey().compareTo(b.getKey()));
                trimmed.put(trim, nums2);
            }
            res[i] = trimmed.get(trim)[k - 1].getValue();
        }

        return res;
    }

    class Node implements Comparable<Node> {
        int index;
        String val;

        Node(int i, String v) {
            index = i;
            val = v;
        }

        public int compareTo(Node other) {
            return this.val.compareTo(other.val);
        }
    }

    public int[] smallestTrimmedNumbers1(String[] nums, int[][] queries) {
        Map<Integer, Node[]> trimmed = new HashMap<>();
        int n = nums.length, m = nums[0].length();
        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0], trim = queries[i][1];
            if (!trimmed.containsKey(trim)) {
                Node[] nodes = new Node[n];
                for (int j = 0; j < n; j++) {
                    nodes[j] = new Node(j, nums[j].substring(m - trim));
                }
                Arrays.sort(nodes);
                trimmed.put(trim, nodes);
            }
            res[i] = trimmed.get(trim)[k - 1].index;
        }

        return res;
    }
}
