package leetcode;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println("This is Original Array" + arr.toString());
        int p1 = 0;
        int p2 = 0;
        // int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            p1 = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + 1 == arr[j]) {
                    p2 = j;

                }
            }
            System.out.println("p1 " + p1 + " " + "p2 " + p2);

        }

    }
}
