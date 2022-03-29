package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC1249_MinimumRemoveToMakeValidParentheses {
    // Counting
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int diff = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (diff != 0 || ch != '(') {
                sb.append(ch);
                switch (ch) {
                    case ')' -> diff++; // Java 12
                    case '(' -> diff--;
                }
            }
        }

        StringBuilder res = new StringBuilder(s.length());
        diff = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (diff != 0 || ch != ')') {
                res.append(ch);
                switch (ch) {
                    case '(' -> diff++; // Java 12
                    case ')' -> diff--;
                }
            }
        }

        return res.toString();
    }

    // Stack or Deque
    public String minRemoveToMakeValid1(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                dq.addLast(sb.length());
            } else if (ch == ')') {
                if (dq.size() == 0) {
                    continue;
                } else {
                    dq.removeLast();
                }
            }
            sb.append(ch);
        }

        if (dq.size() == 0) {
            return sb.toString();
        }

        StringBuilder res = new StringBuilder(s.length());
        while (dq.size() > 0) {
            sb.setCharAt(dq.pollFirst(), '-');
        }
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch != '-') {
                res.append(ch);
            }
        }

        return res.toString();
    }
}