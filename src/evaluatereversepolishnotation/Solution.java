package evaluatereversepolishnotation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int x1 = stack.pop();
                int x2 = stack.pop();
                stack.push(calculate(x1, x2, tokens[i]));
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public int calculate(int x1, int x2, String op) {
        switch (op) {
            case "+":
                return x1 + x2;
            case "*":
                return x1 * x2;
            case "-":
                return x1 - x2;
            case "/":
                return x1 / x2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String[] ss = {"1", "2", "+"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(ss));
    }
}