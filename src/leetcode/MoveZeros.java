package leetcode;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 0, 21, 0 };
        int len = arr.length;

        int j = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[j++] = i;
            }
        }
        while (j < len) {
            arr[j] = 0;
            j++;
        }
        for (int k : arr)
            System.out.print(k + " ");
    }

}
