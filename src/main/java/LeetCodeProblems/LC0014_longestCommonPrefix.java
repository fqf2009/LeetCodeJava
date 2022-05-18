package LeetCodeProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LC0014_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        if (strs.length == 1) return s1;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != ch)
                    return s1.substring(0, i);
            }
        }
        return s1;
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1) return strs[0];
        String s1 = Arrays.stream(strs).min(Comparator.naturalOrder()).get();
        String s2 = Arrays.stream(strs).max(String::compareTo).get();
        for (int i = 0; i < s1.length(); i++) {
            if (i >= s2.length() || s1.charAt(i) != s2.charAt(i))
                return s1.substring(0, i);
        }
        return s1;
    }
}
