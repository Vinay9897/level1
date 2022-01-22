package stack;

// import java.io.BufferedInputStream;

import java.util.*;
// import java.io.*;

public class NextGreaterElement2 {

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
        sc.close();
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
        st.push(0);
        // nge[arr.length] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}