package LeetCodeProblems;

import java.util.Stack;

public class LC0227_BasicCalculatorII {
    public int calculate(String s) {
        int res = 0, v1 = 0, v2 = 0;
        s = s + '+';
        char oper = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') continue;
            if (Character.isDigit(ch)) {
                v2 = v2 * 10 + ch - '0';
                continue;
            }
            if (oper == '+') {
                res += v1;
                v1 = v2;
            } else if (oper == '-') {
                res += v1;
                v1 = -v2;
            } else if (oper == '*') {
                v1 = v1 * v2;
            } else {
                v1 = v1 / v2;
            }
            v2 = 0;
            oper = ch;
        }
        return res + v1;
    }

    // general implementation using stack, support more operators
    private void compressStack(Stack<Integer> stack, int op2) {
        int[] priorities = {0, 0, 1, 1, 2};
        while (stack.size() >= 2 &&
                priorities[stack.get(stack.size() - 2)] >= priorities[op2]) {
            int operand2 = stack.pop();
            int op1 = stack.pop();
            int operand1 = stack.size() > 0 ? stack.pop() : 0;
            // switch expression, Java 12
            int res = 0;
            switch (op1) {
                case 0 -> res = operand1 + operand2;
                case 1 -> res = operand1 - operand2;
                case 2 -> res = operand1 * operand2;
                case 3 -> res = operand1 / operand2;
                case 4 -> res = (int) Math.pow(operand1, operand2);
            }
            stack.push(res);
        }
    }

    public int calculate1(String s) {
        String operators = "+-*/^";
        Stack<Integer> stack = new Stack<>();
        int val = 0;
        s = s + '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                val = val * 10 + ch - '0';
            } else {
                int op = operators.indexOf(ch);
                if (op >= 0) {
                    stack.push(val);
                    compressStack(stack, op);
                    stack.push(op);
                    val = 0;
                }
            }
        }
        return stack.get(0);
    }
}
