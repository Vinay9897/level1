package dynamicprogramming;

import java.util.*;

public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of tile :");
        int n = sc.nextInt();
        sc.close();
        // create a dp array
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print("There are " + dp[n] + " no of ways to design the 2 x " + n + " size board.");

    }

}
