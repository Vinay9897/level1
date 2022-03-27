package leetcode;

// 198 House Robber
public class Solution198 {
    private static int[] dp;

    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 5, 7, 7, 5, 6, 9, 2, 1 };
        System.out.println(rob(arr));
    }

    // return the max robbery
    private static int rob(int[] nums) {
        dp = new int[nums.length + 1];
        return recursion(nums, 0);
    }

    //
    private static int recursion(int[] arr, int start) {
        if (start >= arr.length)
            return 0; // base condiion
        if (dp[start] > 0)
            return dp[start];
        dp[start] = Math.max(recursion(arr, start + 2) + arr[start],
                recursion(arr, start + 1));
        return dp[start];
    }

}
