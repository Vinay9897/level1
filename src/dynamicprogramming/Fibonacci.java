package dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 8;
        int[] dp = new int[number + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        fibonacci(number, dp);
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }

    private static int fibonacci(int number, int[] dp) {

        if (number == 0 || number == 1) {
            return dp[number];
        }
        if (dp[number] == -1) {
            dp[number] = fibonacci(number - 2, dp) + fibonacci(number - 1, dp);
            ;
        } else {
            return dp[number];
        }
        return dp[number];
    }
}