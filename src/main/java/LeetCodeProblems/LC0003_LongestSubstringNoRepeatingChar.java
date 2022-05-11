package LeetCodeProblems;

import java.util.HashMap;

public class LC0003_LongestSubstringNoRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>(256);
        int start = -1;
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start, seen.getOrDefault(s.charAt(i), -1));
            maxlen = Math.max(maxlen, i - start);
            seen.put(s.charAt(i), i);
        }
        return maxlen;
    }
}
