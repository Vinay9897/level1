package stack;

import java.util.*;
// import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String : ");
        String infixString = sc.nextLine();
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < infixString.length(); i++) {
            char ch = infixString.charAt(i);
            if (ch == '(') {
                operator.push(ch);
            } else if ((ch >= 0 && ch <= 9) || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");

            } else if (ch == ')') {

                while (operator.peek() != '(') {
                    proces(operator, postfix, prefix);

                }
                operator.push(ch);

            } else if ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/')) {

                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    proces(operator, postfix, prefix);
                }
                operator.push(ch);

            }
        }
        while (operator.size() > 0) {
            proces(operator, postfix, prefix);
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    private static int precedence(char ch) {

        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }

    }

    public static void proces(Stack<Character> operator, Stack<String> postfix, Stack<String> prefix) {
        char op = operator.pop();
        // for postfix

        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);

        // for prefix

        String prefv2 = prefix.pop();
        String prefv1 = prefix.pop();
        String prefv = op + prefv1 + prefv2;
        prefix.push(prefv);
    }
}
