package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LC0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (!(s.length() == t.length())) return false;
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
            tm.put(t.charAt(i), tm.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sm.equals(tm);
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] delta = new int[26];
        for (int i = 0; i < s.length(); i++) {
            delta[s.charAt(i) - 'a']++;
            delta[t.charAt(i) - 'a']--;
        }
        for (int i : delta) if (i != 0) return false;
        return true;
    }

    // slower than above, because s and t is much longer than 26
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] delta = new int[26];
        for (int i = 0; i < s.length(); i++) {
            delta[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((--delta[t.charAt(i) - 'a']) < 0) return false;
        }
        return true;
    }
}
