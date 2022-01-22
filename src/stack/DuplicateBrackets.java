package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        System.out.println("Please enter the String");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    // return;
                } else {
                    while (st.peek() != '(') {
                        System.out.println(ch + " pop from stack : " + st.pop());
                    }
                }
            } else {
                System.out.println(ch + " Push into Stack : " + st.push(ch));
            }
        }
    }
}