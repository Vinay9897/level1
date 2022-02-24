
package leetcode;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;
        int k = 3;
        int[] rotate = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (i >= len - k && i < len) {
                rotate[j++] = arr[i];
            } else {
                rotate[k + i] = arr[i];
            }
        }
        for (int num : rotate)
            System.out.print(num + " ");
    }

}
