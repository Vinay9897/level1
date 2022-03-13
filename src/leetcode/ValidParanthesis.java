package leetcode;

import java.util.Stack;

class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean val;
        // if((s.length() % 2) != 0)return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);

            } else if (ch == ')') {
                val = handleClosing(st, '(');
                if (val == false)
                    return false;

            } else if (ch == ']') {
                val = handleClosing(st, '[');
                if (val == false)
                    return false;
            } else if (ch == '}') {
                val = handleClosing(st, '{');
                if (val == false)
                    return false;
            }

        }
        if (st.size() == 0)
            return true;
        return st.empty();
    }

    // checking the bracket from string and stack top
    private static boolean handleClosing(Stack<Character> sch, char ch) {

        if (sch.size() == 0)
            return false; // sch : stack character
        if (sch.peek() != ch) {
            return false;
        } else {
            sch.pop();
            return true;
        }

    }

    public static void main(String[] args) {
        String str = "(){}[]";
        boolean b = isValid(str);
        System.out.println(b);
    }
}