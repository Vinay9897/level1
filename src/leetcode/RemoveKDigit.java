package leetcode;

import java.util.Stack;

public class RemoveKDigit {
    public static void main(String[] args) {
        String num = "10";
        int k = 1;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!stack.empty() && stack.peek() > ch && k > 0) {
                stack.pop();
                k--;
            }
            if (!stack.empty() || ch != '0') {
                stack.push(ch);
            }
        }
        while (k > 0) {
            if (!stack.empty()) {
                stack.pop();
                k--;
            }
        }
    }
}
