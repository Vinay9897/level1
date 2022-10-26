package dynamicprogramming;

import java.util.*;

// Given an integer n, return the number of ways to tile an 2 x n board. S
//ince the answer may be very large, return it modulo 109 + 7.
// In a tiling, every square must be covered by a tile. Two tilings
// are different if and only if there are 
//two 4-directionally adjacent cells on the board such that exactly 
// one of the tilings has both squares occupied by a tile.
class TilingProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of tile : ");
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n + 1];

        dp[1] = 1;

        dp[2] = 2;
        if (n == 1) {
            System.out.println(dp[n]);
            return;
        }
        if (n == 2) {
            System.out.println(dp[n]);
            return;
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + 2;
        }
        System.out.println(dp[n]);
    }
}
