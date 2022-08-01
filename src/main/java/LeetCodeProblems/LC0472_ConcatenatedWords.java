package LeetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;

public class LC0472_ConcatenatedWords {
    boolean isConcatenated(String word, Set<String> words, int cnt) {
        if (word.length() == 0) {
            return cnt > 1;
        }
        for (int i = 0; i < word.length(); i++) {
            String w1 = word.substring(0, i + 1);
            if (words.contains(w1)) {
                String w2 = word.substring(i + 1);
                if (isConcatenated(w2, words, cnt + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> res = new ArrayList<>();
        // Set<String> set = new HashSet<>();
        // set.addAll(Arrays.asList(words));
        Set<String> set = Arrays.stream(words).collect(Collectors.toSet());

        for (var w : words) {
            if (isConcatenated(w, set, 0)) {
                res.add(w);
            }
        }

        return res;
    }
}
