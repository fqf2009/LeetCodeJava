package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

// Two stacks of char
public class LC2296_DesignTextEditor {
    private final List<Character> lbuf, rbuf;

    public LC2296_DesignTextEditor() {
        lbuf = new ArrayList<>();
        rbuf = new ArrayList<>();
    }

    public void addText(String text) {
        for (var ch : text.toCharArray())
            lbuf.add(ch);
    }

    public int deleteText(int k) {
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (lbuf.size() == 0) break;
            lbuf.remove(lbuf.size() - 1);
            cnt++;
        }
        return cnt;
    }

    private String textOnLeft(int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = lbuf.size() - Integer.min(k, lbuf.size()); i < lbuf.size(); i++)
            sb.append(lbuf.get(i));
        return sb.toString();
    }

    private void transferBuffers(List<Character> buf1,
                                 List<Character> buf2, int k) {
        for (int i = 0; i < k; i++) {
            if (buf1.size() == 0) break;
            buf2.add(buf1.remove(buf1.size() - 1));
        }
    }

    public String cursorLeft(int k) {
        transferBuffers(lbuf, rbuf, k);
        return textOnLeft(10);
    }

    public String cursorRight(int k) {
        transferBuffers(rbuf, lbuf, k);
        return textOnLeft(10);
    }
}

// Two stacks of string
class LC2296_DesignTextEditor1 {
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
        StringBuilder res = new StringBuilder();
        for (int i = lstack.size() - 1; i >= 0; i--) {
            String s = lstack.get(i);
            int cnt = Integer.min(s.length(), k);
            res.insert(0, s.substring(s.length() - cnt));
            k -= cnt;
            if (k == 0) break;
        }
        return res.toString();
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

// StringBuilder
class LC2296_DesignTextEditor2 {
    private final StringBuilder builder;
    private int cursor;

    public LC2296_DesignTextEditor2() {
        builder = new StringBuilder();
        cursor = 0;
    }

    public void addText(String text) {
        builder.insert(cursor, text);
        cursor += text.length();
    }

    public int deleteText(int k) {
        int cnt = Integer.min(k, cursor);
        cursor -= cnt;
        builder.delete(cursor, cursor + cnt);
        return cnt;
    }

    private String textOnLeft(int k) {
        int cnt = Integer.min(k, cursor);
        return builder.substring(cursor - cnt, cursor);
    }

    public String cursorLeft(int k) {
        cursor -= Integer.min(k, cursor);
        return textOnLeft(10);
    }

    public String cursorRight(int k) {
        cursor += Integer.min(k, builder.length() - cursor);
        return textOnLeft(10);
    }
}
