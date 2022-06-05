package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

// Two stacks
public class LC2296_DesignTextEditor1 {
    private final List<String> lstack, rstack;

    public LC2296_DesignTextEditor1() {
        lstack = new ArrayList<>();
        rstack = new ArrayList<>();
    }

    public void addText(String text) {
        lstack.add(text);
    }

    public int deleteText(int k) {
        int cnt = 0;
        while (lstack.size() > 0 && k > 0) {
            String s = lstack.remove(lstack.size() - 1);
            if (s.length() <= k) {
                cnt += s.length();
                k -= s.length();
            } else {
                lstack.add(s.substring(0, s.length() - k));
                cnt += k;
                break;
            }
        }
        return cnt;
    }

    private String textOnLeft(int k) {
        String res = "";
        for (int i = lstack.size() - 1; i >= 0; i--) {
            String s = lstack.get(i);
            int cnt = Integer.min(s.length(), k);
            res = s.substring(s.length() - cnt) + res;
            k -= cnt;
            if (k == 0) break;
        }
        return res;
    }

    public String cursorLeft(int k) {
        while (lstack.size() > 0 && k > 0) {
            String s = lstack.remove(lstack.size() - 1);
            if (s.length() <= k) {
                rstack.add(s);
                k -= s.length();
            } else {
                lstack.add(s.substring(0, s.length() - k));
                rstack.add(s.substring(s.length() - k));
                break;
            }
        }
        return textOnLeft(10);
    }

    public String cursorRight(int k) {
        while (rstack.size() > 0 && k > 0) {
            String s = rstack.remove(rstack.size() - 1);
            if (s.length() <= k) {
                lstack.add(s);
                k -= s.length();
            } else {
                lstack.add(s.substring(0, k));
                rstack.add(s.substring(k));
                break;
            }
        }
        return textOnLeft(10);
    }
}
