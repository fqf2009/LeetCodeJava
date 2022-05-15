package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LC2273_RemoveAnagrams {
    private boolean isAnagram(String w1, String w2) {
        if (w1.length() != w2.length()) return false;
        int[] cnt = new int[26];
        for (int i = 0; i < w1.length(); i++) {
            cnt[w1.charAt(i) - 'a']++;
            cnt[w2.charAt(i) - 'a']--;
        }
        for (int i : cnt) {
            if (i != 0) return false;
        }
        return true;
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i - 1], words[i])) {
                res.add(words[i]);
            }
        }
        return res;
    }
}
