package dynamicprogramming;

// import java.util.*;
public class REM10 {
    // 10. Regular Expression Matching

    // * matches with zero or more preceding of element
    // . matches with any single character
    public static void main(String[] args) {
        String pattern = "a*.b";
        String str = "ayxb";
        System.out.println(isMatch(pattern.toCharArray(), str.toCharArray()));
    }

    public static boolean isMatch(char[] pattern, char[] str) {
        boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
        dp[0][0] = true;

        // (a* or a*b* and many more that can match with empty string)
        // because * can be zero or more preceding of element
        for (int i = 1; i < dp[0].length; i++) {
            if (pattern[i - 1] == '*')
                dp[0][i] = dp[0][i - 2];
        }
        for (int r = 1; r < dp.length; r++) {
            for (int c = 1; c < dp[0].length; c++) {
                // if dot == current char or pattern[index] == str[index]
                if ((pattern[c - 1] == str[r - 1]) || pattern[c - 1] == '.') {
                    // get from left diagonal
                    dp[r][c] = dp[r - 1][c - 1];

                    // case1L star(*) withe zero preceding element
                } else if (pattern[c - 1] == '*') {
                    dp[r][c] = dp[r][c - 2];
                    // case 2: star(*) greater than zero preceding element
                    if (str[r - 1] == pattern[c - 2] || pattern[c - 2] == '.') {
                        // get answer from top
                        dp[r][c] = dp[r - 1][c];
                    }
                }
            }
        }
        for (boolean[] ch : dp) {
            for (boolean ch1 : ch) {
                System.out.print(ch1 + " ");
            }
            System.out.println();
        }
        return dp[str.length - 1][pattern.length - 1];
    }

}
