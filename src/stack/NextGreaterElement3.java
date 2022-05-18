package stack;

import java.util.*;

// traversing the array from reverse using index of array

public class NextGreaterElement3 {
    public static void main(String[] args) {

        int[] arr = new int[] { 5, 2, 8, 9, 6, 7, 1, 4, 0 };
        int[] nge1 = solve(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : nge1) {
            System.out.print(val + " ");
        }
    }

    private static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nge[arr.length - 1] = -1;
        // int pos = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                // nge[i] = arr[st.peek()];
                // pos = st.peek();
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = arr[st.peek()];
            }
            st.push(i);
        }

        return nge;
    }

}
