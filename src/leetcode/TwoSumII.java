package leetcode;

// Approach two pointer

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11 };
        // int len = arr.length - 1;
        int target = 9;
        twoSum(arr, target);

    }

    private static int[] twoSum(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if ((arr[low] + arr[high]) < target) {
                low++;
            } else if ((arr[low] + arr[high]) > target) {
                high--;
            } else {
                System.err.println(low + " " + high);
                break;
            }
        }
        return new int[] { low, high };

    }

}
