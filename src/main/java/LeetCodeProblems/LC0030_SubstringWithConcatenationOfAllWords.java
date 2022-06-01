package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0030_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wl = words[0].length();
        Map<String, Integer> counts = new HashMap<>();
        for (var word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < s.length() - words.length * wl + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();
            boolean valid = true;
            for (int j = 0; j < words.length; j++) {
                String s1 = s.substring(i + j * wl, i + (j + 1) * wl);
                if (seen.getOrDefault(s1, 0) >= counts.getOrDefault(s1, 0)) {
                    valid = false;
                    break;
                }
                seen.put(s1, seen.getOrDefault(s1, 0) + 1);
            }
            if (valid)
                res.add(i);
        }
        return res;
    }

    public List<Integer> findSubstring1(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wl = words[0].length();
        Map<String, Integer> counts = new HashMap<>();
        for (var word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < s.length() - words.length * wl + 1; i++) {
            Map<String, Integer> countDown = new HashMap<>(counts);
            boolean valid = true;
            for (int j = 0; j < words.length; j++) {
                String s1 = s.substring(i + j * wl, i + (j + 1) * wl);
                int cnt = countDown.getOrDefault(s1, 0);
                if (cnt == 0) {
                    valid = false;
                    break;
                }
                countDown.put(s1, cnt - 1);
            }
            if (valid)
                res.add(i);
        }
        return res;
    }
}
