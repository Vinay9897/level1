package leetcode;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String s = "baab";

        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findlength(s, i, i);// for odd length
            int len2 = findlength(s, i, i + 1); // for even length
            int len = Math.max(len1, len2);
            if (end - start < len) {
                start = i - (len - 1) / 2;
                end = i + (len) / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int findlength(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
