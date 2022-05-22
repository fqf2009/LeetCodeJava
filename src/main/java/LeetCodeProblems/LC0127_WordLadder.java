package LeetCodeProblems;

import java.util.*;

public class LC0127_WordLadder {
    private List<String> getWildcards(String word) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            res.add(word.substring(0, i) + "*" + word.substring(i + 1));
        }
        return res;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> graph = new HashMap<>();
        for (var word : wordList) {
            for (var wildcard : getWildcards(word)) {
                if (!graph.containsKey(wildcard)) {
                    graph.put(wildcard, new ArrayList<>());
                }
                graph.get(wildcard).add(word);
            }
        }

        Set<String> visited = new HashSet<>();
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast(beginWord);
        int res = 1;    // beginWord counts
        while (dq.size() > 0) {
            res++;
            int n = dq.size();
            for (int i = 0; i < n; i++) {   // visit entire layer
                String w1 = dq.removeFirst();
                for (var wildcard : getWildcards(w1)) {
                    if (!visited.contains(wildcard) && graph.containsKey(wildcard)) {
                        visited.add(wildcard);
                        for (var w2 : graph.get(wildcard)) {
                            if (w2.equals(endWord)) {
                                return res;
                            }
                            dq.addLast(w2);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
