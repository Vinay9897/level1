package stack;

// import java.io.BufferedInputStream;

import java.util.*;
import java.io.*;

public class NextGreaterElement {

    public static void main(String[] args) throws Exception {

        //
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        System.out.println("Please enter the values in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            // a[i] = Integer.parseInt(br.readLine());
            a[i] = sc.nextInt();
        }
        int[] nge = solve(a);
        display(nge);
    }

    private static void display(int[] nge) {
        StringBuilder sb = new StringBuilder();
        for (int val : nge) {
            sb.append(val + " ");
        }
        System.out.print(sb);
    }

    private static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop(); // pop the value from the stack if index value is greater then stack peek value
            }
            if (st.size() == 0) {
                nge[i] = -1; // put at ith index in the nge array , -1 if stack is empty
            } else {
                nge[i] = st.peek(); // else

                st.push(arr[i]);
            }

        }
        return nge;
    }
}