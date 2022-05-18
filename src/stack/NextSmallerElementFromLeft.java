package stack;

import java.util.Scanner;
import java.util.*;

public class NextSmallerElementFromLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // create a new array which store the next Smaller Element from left
        int[] nse = solve(arr);
        display(arr, nse);
    }

    private static void display(int[] arr, int[] nse) {
        System.out.println("Enter the Original Array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("Enter the Resulting Array:");
        for (int val : nse) {
            System.out.print(val + " ");
        }
    }

    private static int[] solve(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int pos = stack.peek();
                nse[pos] = arr[i];
                stack.pop();
            }
            stack.push(i);

        }
        while (!stack.isEmpty()) {
            nse[stack.peek()] = -1;
            stack.pop();
        }
        nse[arr.length - 1] = -1;
        return nse;
    }

}
