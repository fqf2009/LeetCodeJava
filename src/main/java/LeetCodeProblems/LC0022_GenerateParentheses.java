package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC0022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        backtrack(res, stack, n, 0, 0);
        return res;
    }

    private void backtrack(List<String> list, Stack<String> stack, int n, int left, int right) {
        if (stack.size() == n * 2) {
            list.add(String.join("", stack));
            return;
        }
        if (left < n) {
            stack.push("(");
            backtrack(list, stack, n, left + 1, right);
            stack.pop();
        }
        if (left > right) {
            stack.push(")");
            backtrack(list, stack, n, left, right + 1);
            stack.pop();
        }
    }

    public List<String> generateParenthesis1(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder par = new StringBuilder();
        backtrack1(res, par, n, 0, 0);
        return res;
    }

    private void backtrack1(List<String> list, StringBuilder par, int n, int left, int right) {
        if (par.length() == n * 2) {
            list.add(par.toString());
            return;
        }
        if (left < n) {
            par.append('(');
            backtrack1(list, par, n, left + 1, right);
            par.deleteCharAt(par.length() - 1);
        }
        if (left > right) {
            par.append(')');
            backtrack1(list, par, n, left, right + 1);
            par.deleteCharAt(par.length() - 1);
        }
    }
}
