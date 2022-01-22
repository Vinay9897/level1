package stack;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the values in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] span = solveSpan(arr);
        display(span);
        sc.close();
    }

    private static void display(int[] span) {
        StringBuilder sb = new StringBuilder();
        for (int val : span) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    private static int[] solveSpan(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
