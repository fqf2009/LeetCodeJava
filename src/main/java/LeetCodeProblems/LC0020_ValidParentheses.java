package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC0020_ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (dq.size() == 0 || dq.removeLast() != '(') return false;
                    break;
                case ']':
                    if (dq.size() == 0 || dq.removeLast() != '[') return false;
                    break;
                case '}':
                    if (dq.size() == 0 || dq.removeLast() != '{') return false;
                    break;
                default:
                    dq.addLast(s.charAt(i));
            }
        }
        return dq.size() == 0;
    }
}
