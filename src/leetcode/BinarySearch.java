package leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = -1;
        System.out.println(search(arr, target));

    }

    public static int search(int[] nums, int target) {
        // int mid = nums[nums.length / 2];
        // int output = -1;
        // if (mid < target) {
        // for (int i = nums.length / 2; i < nums.length; i++) {
        // if (nums[i] == target) {
        // output = i;
        // return output;
        // }
        // }
        // } else {
        // for (int j = 0; j < nums.length / 2; j++) {
        // if (nums[j] == target) {
        // output = j;
        // return output;
        // }
        // }
        // }
        // return output;
        // }
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid])
                return mid;
            if (target > nums[mid]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return nums[low] == nums.length ? low : -1;
    }

}
