package leetcode;

import java.util.Stack;

// 946. Validate Stack Sequences
public class Solution946 {
    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 }, popped = { 4, 5, 3, 2, 1 };
        int i = 0, j = 0;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.add(pushed[i]);
        st2.add(popped[j]);
        while (i < pushed.length && j < popped.length) {
            if (st1.peek() == st2.peek()) {
                st1.pop();
                st2.pop();
                j++;
                st2.add(popped[j]);
                if (st1.empty())
                    st1.add(pushed[++i]);
            } else {
                st1.add(pushed[++i]);
            }
        }
        if (st1.empty())
            System.out.println("true");
        else
            System.out.println("false");

    }
}