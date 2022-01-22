package stack;

// import java.util.*;

public class SlidingWindowMaximam {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 8, 3, 7, 3, 9, 4, 9, 5, 3, 8 };
        int frame = 4;
        int[] arr1 = new int[arr.length - frame];

        for (int i = 0; i < arr.length - frame; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < frame + i; j++) {
                if (max <= arr[j]) {
                    max = arr[j];
                    arr[j] = max;
                }
                arr1[i] = max;

            }

        }
        for (int val : arr1) {
            System.out.print(val + " ");
        }

    }

}
