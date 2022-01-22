package stack;

import java.util.Stack;

public class StackImplementation {

    private static ListNode top;
    private static int size;

    public class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public StackImplementation() {
        size = 0;
        top = null;
    }

    public static void main(String[] args) {

        StackImplementation stack = new StackImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        traverse();
        stack.pop();
        traverse();
        stack.size();
        stack.peek();
        stack.top();
        System.out.println(size());

    }

    private boolean isEmpty() {
        return top == null;
    }

    private void top() {
        if (!isEmpty()) {
            System.out.println("top :" + top.data);
        } else {
            System.out.println("List is empty");
        }
    }

    private void peek() {
        if (!isEmpty()) {
            System.out.println("peek :" + top.data);
        } else {
            System.out.println("list is empty");
        }
    }

    private static int size() {
        return size;
    }

    private void pop() {
        if (!isEmpty()) {
            top = top.next;
            size--;
        } else {
            System.out.println("list is empty");
        }
    }

    private static void traverse() {
        ListNode temp = top;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null");

    }

    private void push(int data) {
        ListNode temp = new ListNode(data);
        if (top == null) {
            top = temp;
            size++;
        } else {
            temp.next = top;
            top = temp;
            size++;
        }
    }

}
