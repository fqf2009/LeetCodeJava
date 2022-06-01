package LeetCodeProblems;

public class LC0044_WildcardMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        int i = 0, j = 0;
        int iSave = -1, jStar = -1;
        while (i < m) {
            if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < n && p.charAt(j) == '*') {
                iSave = i;
                jStar = j;
                j += 1;
            } else if (jStar == -1) {
                return false;
            } else {
                i = iSave + 1;
                j = jStar;
                iSave = i;
            }
        }

        return j == n || p.substring(j, n).replace("*", "").length() == 0;
    }
}
