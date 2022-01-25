package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        int amount = 18;
        int[] coin = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coin :");
        for (int i = 0; i < coin.length; i++) {
            coin[i] = sc.nextInt();
        }
        sc.close();
        // new method for finding the minimum coin
        int ans = coinChange(coin, amount);
        System.out.println(ans);

        // end

        // int[] dp = new int[amount + 1];
        // int max = amount +1;
        // Arrays.fill(dp, max);
        // dp[0] = 0;
        // int ans = coinChangeMethod(amount, coin, dp);
        // System.out.println(ans);
        // for (int x : dp) {
        // System.out.print(x + " ");
        // }
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    System.out.println(i + "-->" + dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // private static int coinChangeMethod(int amount, int[] coin, int[] dp) {

    // if (amount == 0)
    // return 0;
    // int ans = Integer.MAX_VALUE;

    // for (int i = 0; i < coin.length; i++) {
    // if (amount - coin[i] >= 0) {
    // int subAns = 0;
    // if ((dp[amount - coin[i]]) != -1) {
    // subAns = dp[amount - coin[i]];
    // } else {
    // subAns = coinChangeMethod(amount - coin[i], coin, dp);
    // }
    // if ((subAns != Integer.MAX_VALUE) && subAns + 1 < ans) {
    // ans = subAns + 1;
    // }
    // }
    // }
    // return dp[amount] = ans;
    // }

}
