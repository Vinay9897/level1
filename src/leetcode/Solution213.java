package leetcode;

public class Solution213 {
    // 213.House Rubber
    private static int[] dp;

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2 };
        System.out.println(rob(arr));
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
    }

    public static int rob(int[] nums) {
        dp = new int[nums.length + 1];
        return recursion(nums, 0);
    }

    private static int recursion(int[] nums, int i) {
        if (i >= nums.length - 1)
            return 0;
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (i = 2; i < nums.length; i++) {
            dp[i] = dp[i - 2] + nums[i];
        }
        return dp[i - 1];

    }

}
