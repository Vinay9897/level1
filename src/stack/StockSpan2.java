package stack;

import java.util.*;

public class StockSpan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Please enter the size of the array: ");
        int[] arr = new int[n];
        System.out.println("Please enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nge = solve(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : nge) {
            System.out.print(val + " ");
        }
        sc.close();
    }

    private static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        nge[0] = 1;
        for (int i = 1; i <= arr.length - 2; i++) {
            int j = i + 1;
            if (arr[j] > arr[i]) {
                nge[j] = j++;

            } else {
                nge[j] = j - i;
                j++;
            }
        }
        return nge;
    }

}
