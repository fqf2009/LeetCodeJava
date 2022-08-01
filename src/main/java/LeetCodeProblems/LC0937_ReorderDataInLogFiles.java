package LeetCodeProblems;

import java.util.Arrays;

public class LC0937_ReorderDataInLogFiles {
    int compare(String s1, String s2) {
        int idx1 = s1.indexOf(' ') + 1;
        int idx2 = s2.indexOf(' ') + 1;
        boolean isDigit1 = Character.isDigit(s1.charAt(idx1));
        boolean isDigit2 = Character.isDigit(s2.charAt(idx2));
        if (isDigit1) {
            return isDigit2 ? 0 : 1;
        } else {
            if (isDigit2) {
                return -1;
            } else {
                int cmp = s1.substring(idx1).compareTo(s2.substring(idx2));
                return cmp != 0 ? cmp : s1.substring(0, idx1).compareTo(s2.substring(0, idx2));
            }
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        String[] res = Arrays.copyOf(logs, logs.length);
        Arrays.sort(res, this::compare);
        return res;
    }

    public String[] reorderLogFiles1(String[] logs) {
        return Arrays.stream(logs).sorted(this::compare).toArray(String[]::new);
    }
}
