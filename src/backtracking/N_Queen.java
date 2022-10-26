package backtracking;

// import java.util.*;

import java.util.Scanner;

// this is question of N_Queen using Branch and bound
public class N_Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the board: ");
        int n = sc.nextInt();
        int row = 0;
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] normalDg = new boolean[2 * n - 1];
        boolean[] revDg = new boolean[2 * n - 1];
        String ans = "";
        sc.close();
        solve(board, row, cols, normalDg, revDg, ans);

    }

    private static void solve(boolean[][] board, int row, boolean[] cols, boolean[] normalDg, boolean[] revDg,
            String ans) {

        if (row == board.length) {
            System.out.println(ans + ".");
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (cols[col] == false && normalDg[col + row] == false &&
                    revDg[row - col + board.length - 1] == false) {
                board[row][col] = true;
                cols[col] = true;
                normalDg[row + col] = true;
                revDg[row - col + board.length - 1] = true;
                System.out.println(board.length);
                solve(board, row + 1, cols, normalDg, revDg, ans + row + "-" + col);
                board[row][col] = false;
                cols[col] = false;
                normalDg[row + col] = false;
                revDg[row - col + board.length - 1] = false;
            }
        }
    }
}
