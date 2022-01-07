package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrakets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("Please enter the String : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
                // else {
                // System.out.println(val);
                // return;
                // }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
                // else {
                // System.out.println(val);
                // return;
                // }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
                // else {
                // System.out.println(val);
                // return;
                // }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean handleClosing(Stack<Character> st, char c) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != c) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
