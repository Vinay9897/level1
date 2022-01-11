package stack;

import java.util.*;

public class HistogramPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the values in the  array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Code
        int[] rb = new int[arr.length]; // next smaller element index on the right
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for (int i = rb.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);

        }

        int[] lb = new int[arr.length]; // next smaller element index on the right
        Stack<Integer> st2 = new Stack<>();
        st2.push(0);
        lb[0] = -1;
        for (int i = 1; i < lb.length; i++) {
            while (st2.size() > 0 && arr[i] <= arr[st2.peek()]) {
                st2.pop();
            }

            if (st2.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st2.peek();
            }
            st2.push(i);

        }

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        for (int val : lb) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : rb) {
            System.out.print(val + " ");
        }
        System.out.println("Max Area : " + maxArea);
    }

}
