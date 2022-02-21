package dynamicprogramming;

import java.util.Arrays;

public class MinimumStepTo1 {
    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;
        int min = minStep(n, dp);
        System.out.println(min);
        // for (int i = 0; i < n + 1; i++) {
        // System.out.print(dp[i] + " ");
        // }
    }

    private static int minStep(int n, int[] dp) {
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;
        if (n == 1)
            return 0;
        int ans1 = minStep(n - 1, dp);
        if (n % 2 == 0)
            ans2 = minStep(n / 2, dp);
        if (n % 3 == 0)
            ans3 = minStep(n / 3, dp);

        // Memoization
        if (dp[n] == -1) {
            dp[n] = 1 + Math.min(Math.min(ans1, ans2), ans3);
        } else
            return dp[n];

        return dp[n];
    }

}
